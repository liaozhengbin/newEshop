<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>eshop电子书城</title>
<meta name="keywords" content="会员登录" />
<link rel="shortcut icon" href="favicon.ico" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/public/css/style.css"
	type="text/css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/public/css/bootstrap.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/public/css/theme.css">
<script src="${pageContext.request.contextPath }/public/js/tooltips.js"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath }/public/js/jquery-1.7.2.min.js"
	type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/public/js/jquery.js"
	type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/public/js/tooltips.js"
	type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/public/js/common.js"
	type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/public/js/bootstrap.js"
	type="text/javascript"></script>



</head>

<body>
	<!-- 顶部导航 -->
	<div id="site_nav">
		<div class="sn_container clearfix">
			<ul class="tg_tools fr">
				<li class="no-hover"><a id="msg_notify" class="msg_notify"
					href="member_message.html"></a></li>
				<li class='box_color nav_home'><span><a
						href="${pageContext.request.contextPath }/user/member.action"><span>我的账户</span></a></span><b
					class="icon"></b>
					<ul>
						<li><a
							href="${pageContext.request.contextPath }/book/history.action"><span>浏览记录</span></a>
						</li>

						<li><a
							href="${pageContext.request.contextPath }/NewEshop/cart/selectlist.action"><span>购物车(10)</span></a>
						</li>
						<li><a
							href="${pageContext.request.contextPath }/login/exit.action"><span>退出登录</span></a>
						</li>
					</ul></li>
				<li class="tg-line icon"></li>
				<li class='box_color'><span>帮助中心</span><b class="icon"></b>
					<ul>
						<li><a href="#"><span>联系我们</span></a></li>
						<li><a href="#"><span>关于我们</span></a></li>
					</ul></li>
			</ul>
			<ul class="tg_tools fl" id="login_area">
				<li class="tg_tools_home no-hover"><i class="icon-more"></i><span><a
						href="${pageContext.request.contextPath }/index.jsp">eshop首页</a></span></li>
				<li class="tg-line icon"></li>
				<li class="no-hover nologin"><span><a
						href="${pageContext.request.contextPath }/reg/login.action">新用户注册</a></span></li>
				<li class="tg-line icon"></li>
				<li class="no-hover nologin"><span><a
						href="${pageContext.request.contextPath }/login.jsp">亲，请先登录！</a></span></li>
			</ul>
		</div>
	</div>

	<!-- 如果不是登录页面，就显示 -->
	<div class="row-fluid">
		<div class="dialog">
			<div class="block">
				<p class="block-heading">登录</p>
				<div class="block-body">
					<form>
						<label>用户名/邮箱</label> <input type="text" class="span12"
							id="username" name="username" title="ⓘ提示" data-container="body"
							data-toggle="popover" data-placement="right"
							data-content="用户名或邮箱不能为空" /> <label>密码</label> <input
							type="password" class="span12" id="pwd" name="pwd" title="ⓘ提示"
							data-container="body" data-toggle="popover"
							data-placement="right" data-content="密码不能为空" /> <label>验证码</label>
						<input type="text" class="span8" id="authCode" name="authCode"
							title="ⓘ提示" data-container="body" data-toggle="popover"
							data-placement="right" data-content="验证码错误" /> <a
							href="javascript:verification()"> <img
							src="${pageContext.request.contextPath }/verification_controller/doGet.action"
							id="imgCode" />
						</a> <label><hr /></label> <a href="javascript:sublogin()"
							class="btn btn-primary pull-right">登录</a> <label
							class="remember-me"><input type="checkbox"
							name="rememberme" id="rememberme">两周内免登录</label>

						<div class="clearfix"></div>
					</form>
				</div>
			</div>
			<p>
				<a href="#">忘记密码?</a>
			</p>
		</div>
	</div>
	<script type="text/javascript">
		$(function() {
			loadMethod('${pageContext.request.contextPath }');
		});
	</script>

</body>
</html>



