var isValidateEmail = false;
var isValidateUsername = false;
var isValidatePwd = false;
var isValidatePwd2 = false;
var isValidatePhone = false;
var isValidateAnswer = false;
var isValidateAuthcode = false;
var rootURL;

function loadMethod(rURL) {
	rootURL = rURL;
	$(function() {
		// 判断邮箱是否存在
		$("#email").blur(function() {
			var emailValue = this.value;
			var testEmail = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
			if (emailValue == '') {
				isValidateEmail = false;
				$(this).attr("data-content", "邮箱不能为空");
				$(this).popover("show");
			} else if (!testEmail.test(emailValue)) {
				isValidateEmail = false;
				$(this).attr("data-content", "邮箱格式不对");
				$(this).popover("show");
			} else {
				var url = rootURL + "/user/selectEmail.action";
				var params = {
					email : emailValue
				};
				$.post(url, params, function(response) {
					if (response == "1") {
						isValidateEmail = false;
						$("#email").attr("data-content", "邮箱已存在");
						$("#email").popover("show");
					} else {
						isValidateEmail = true;
						$("#email").popover("destroy");
					}
				});
			}
		});

		// 判断用户名是否存在
		$("#username").blur(function() {
			var userNameValue = this.value;
			if (userNameValue == '') {
				isValidateUsername = false;
				$(this).attr("data-content", "用户名不能为空");
				$(this).popover("show");
			} else {
				var url = rootURL + "/user/selectUserName.action";
				var params = {
					username : userNameValue
				};
				$.post(url, params, function(response) {
					if (response == "1") {
						isValidateUsername = false;
						$("#username").attr("data-content", "用户名已存在");
						$("#username").popover("show");
					} else {
						isValidateUsername = true;
						$("#username").popover("destroy");
					}
				});
			}
		});

		$("#password").blur(function() {
			var passwordValue = this.value;
			if (passwordValue == '') {
				isValidatePwd = false;
				$(this).attr("data-content", "密码不能为空");
				$(this).popover("show");
			} else if (passwordValue.length < 6) {
				isValidatePwd = false;
				$(this).attr("data-content", "密码长度最少6位");
				$(this).popover("show");
			} else {
				isValidatePwd = true;
				$(this).popover("destroy");
			}
		});

		$("#password2").blur(function() {
			var password2Value = this.value;
			if (password2Value == '') {
				isValidatePwd2 = false;
				$(this).attr("data-content", "密码不能为空");
				$(this).popover("show");
			} else if (password2Value != $("#password").val()) {
				isValidatePwd2 = false;
				$(this).attr("data-content", "二次密码不一致");
				$(this).popover("show");
			} else {
				isValidatePwd2 = true;
				$(this).popover("destroy");
			}
		});

		/*
		 * 验证手机号码
		 */
		$("#phone").blur(function() {
			var value = this.value;
			var testPhone = /^1[3|4|5|7|8]\d{9}$/;

			if (value == '') {
				isValidatePhone = false;
				$(this).attr("data-content", "手机号码不能为空");
				$(this).popover("show");
			} else if (!testPhone.test(value)) {
				isValidatePhone = false;
				$(this).attr("data-content", "手机格式不正确");
				$(this).popover("show");
			} else {
				isValidatePhone = true;
				$(this).popover("destroy");
			}
		});

		/*
		 * 验证密保问题
		 */
		$("#answer").blur(function() {
			var value = this.value;
			if (value == '') {
				isValidateAnswer = false;
				$(this).attr("data-content", "答案不能为空");
				$(this).popover("show");
			} else {
				isValidateAnswer = true;
				$(this).popover("destroy");
			}
		});

		/*
		 * 验证验证码
		 */
		$("#authCode").blur(function() {
			var value = this.value;
			if (value == '') {
				isValidateAuthcode = false;
				$(this).attr("data-content", "验证码不能为空");
				$(this).popover("show");
			} else {

				var verifyurl = rootURL + "/login/validation.action";
				var verifydata = {
					authCode : value
				};
				$.post(verifyurl, verifydata, function(response) {
					if (response == 0) {
						$("#authCode").attr("data-content", "验证码不正确");
						$("#authCode").popover("show");
						verification();
					} else {
						isValidateAuthcode = true;
						$("#authCode").popover("destroy");
					}
				});
			}
		});

		// 问题（请求服务端的获取响应json数据）
		$.post(rootURL + "/test/problem.action", null, function(response) {
			var resultJSON = $.parseJSON(response);
			if (resultJSON.status == 200) {
				var list = resultJSON.list;
				var str = "<option value=''>--请选择一个问题--</option>";
				for (var i = 0; i < list.length; i++) {
					var obj = list[i];
					str += "<option value='" + obj.question_id + "'>"
							+ obj.question_title + "</option>";
				}
				$("#qustion").html(str);
			}
		});

		// 省（请求服务端的获取响应json数据）

		$.post(rootURL + "/test/sheng.action", null, function(response) {
			var resultJSON = $.parseJSON(response);
			if (resultJSON.status == 200) {
				var list = resultJSON.list;
				var str = "<option value=''>--请选择省--</option>";
				for (var i = 0; i < list.length; i++) {
					var obj = list[i];
					str += "<option value='" + obj.id + "'>" + obj.name
							+ "</option>";
				}
				$("#province").html(str);
			}

		});
		// 市（请求服务端的获取响应json数据）
		$("#province").change(
				function() {
					var params = {
						provinceid : this.value
					};
					$.post(rootURL + "/test/shi.action", params, function(
							response) {
						var resultJSON = $.parseJSON(response);
						if (resultJSON.status == 200) {
							var list = resultJSON.list;
							var str = "<option value=''>--请选择市--</option>";
							for (var i = 0; i < list.length; i++) {
								var obj = list[i];
								str += "<option value='" + obj.id + "'>"
										+ obj.name + "</option>";
							}
							$("#city").html(str);
						}
					});
				});

		$("#city").change(
				function() {
					// 区（请求服务端的获取响应json数据）
					var params = {
						cityid : this.value
					};
					$.post(rootURL + "/test/qu.action", params, function(
							response) {
						var resultJSON = $.parseJSON(response);
						if (resultJSON.status == 200) {
							var list = resultJSON.list;
							var str = "<option value=''>--请选择区/县--</option>";
							for (var i = 0; i < list.length; i++) {
								var obj = list[i];
								str += "<option value='" + obj.id + "'>"
										+ obj.name + "</option>";
							}
							$("#area").html(str);
						}

					});
				});
	});

}

function subReg() {
	var email = $("#email").val();
	var username = $("#username").val();
	var password = $("#password").val();
	var sex = $("input[name='sex']:checked").val();
	var phone = $("#phone").val();
	var province = $("#province").val();
	var city = $("#city").val();
	var area = $("#area").val();
	var address = $("#address").val();
	var qustion = $("#qustion").val();
	var answer = $("#answer").val();
	var authCode = $("#authCode").val();

	if (email == "") {
		show_err_msg("请输入邮箱");
	} else if (username == "") {
		show_err_msg("请输入用户名");
	} else if (password == "") {
		show_err_msg("请输入密码");
	} else if (phone == "") {
		show_err_msg("请输入电话");
	} else if (province == "") {
		show_err_msg("请选择省");
	} else if (city == "") {
		show_err_msg("请选择市");
	} else if (area == "") {
		show_err_msg("请选择区");
	} else if (address == "") {
		show_err_msg("请输入地址");
	} else if (qustion == "") {
		show_err_msg("请选择问题");
	} else if (answer == "") {
		show_err_msg("请输入答案");
	} else {
		if (isValidateEmail && isValidateUsername && isValidatePwd
				&& isValidatePwd2 && isValidatePhone && isValidateAnswer
				&& isValidateAuthcode) {
			show_loading();
			var params = {
				email : email,
				username : username,
				password : password,
				sex : sex,
				phone : phone,
				province : province,
				city : city,
				area : area,
				address : address,
				qustion : qustion,
				answer : answer,
				authCode : authCode
			};
			$.post(rootURL + "/user/add.action", params, function(response) {

				var jsonOBJ = $.parseJSON(response);
				if (jsonOBJ.status == 200) {
					show_msg("注册成功,请到邮箱激活登录", rootURL + "/index.jsp");
				} else {
					show_msg("服务器忙请稍后注册", rootURL + "/login.jsp");
				}
			});
		}

	}

}

function verification() {
	document.getElementById('imgCode').src = "doGet.action?yanzheng="
			+ new Date().getTime();
}
