var url = null;
var isRememberme = null;
var user_id = null;

function loadMethod(urll) {
	url = urll;
}

function sublogin() {

	var email = $("#username").val();
	var pwd = $("#pwd").val();
	var authCode = $("#authCode").val();

	if (email == "") {
		show_err_msg("请输入用户名/邮箱");
	} else if (pwd == "") {
		show_err_msg("请输入密码！");
	} else if (authCode == "") {
		show_err_msg("请输入验证码！");
	} else {
		show_loading();
		var params = {
			username : email,
			pwd : pwd,
			authCode : authCode
		};
		$.post(url + "/login/login.action", params, function(response) {
			var jsonOBJ = $.parseJSON(response);
			if (jsonOBJ.status == 501) {// 验证码错误
				show_err_msg("验证码错误");
				verification()
			} else if (jsonOBJ.status == 502) {// 账号或密码错误
				show_err_msg("账号或密码错误");
				verification()
			} else if (jsonOBJ.status == 503) {// 账号未激活
				show_err_msg("账号未激活");
				verification()
			} else {// 登录成功
				// 处理cookie的问题
				isRememberme = $("#rememberme").prop("checked");
				if (isRememberme) {// 勾选了“记住登录”
					user_id = jsonOBJ.user_id;
					setCookie("userId", user_id, 60 * 24 * 7);
				}

				var responseURL = jsonOBJ.loginReturnURL;
				if (responseURL == null || responseURL == '') {
					show_msg("登录成功", url + "/index.jsp");
				} else {
					show_msg("登录成功", url + "/" + responseURL);
				}
			}
		});
	}
}

function setCookie(name, value, iDay) {
	var oDate = new Date();

	oDate.setDate(oDate.getDate() + iDay);

	document.cookie = name + '=' + encodeURIComponent(value) + ';expires='
			+ oDate;
}

function removeCookie() {
	
	setCookie("userId", '1', -1);
	$.post("login/exit.action", null, function(response) {

		var jsonOBJ = $.parseJSON(response);
		if (jsonOBJ.status == 200) {
			show_msg("退出成功", url + "/login.jsp");
		}
	});

}

$(function() {
	// 判断验证码是否正确
	$("#authCode").blur(function() {
		var authCodeValue = this.value;
		var url = "login/validation.action";
		$.ajax({
			url : url,
			type : "POST",
			data : {
				authCode : authCodeValue
			},
			success : function(response) {
				if (response != "1") {
					show_err_msg("验证码有误");
				}
			},
			error : function(e) {
				console.log("请求失败，异常信息是：" + e);
			}
		});
	});
});

function verification() {
	document.getElementById('imgCode').src = url
			+ "/verification_controller/doGet.action?yanzheng="
			+ new Date().getTime();
}
