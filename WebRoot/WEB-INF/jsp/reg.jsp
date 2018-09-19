<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>eshop电子书城</title>
	<link rel="shortcut icon" href="favicon.ico" />
	<link rel="stylesheet" href="${pageContext.request.contextPath }/public/css/style.css" type="text/css" /> 
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/public/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/public/css/theme.css">
    <script src="${pageContext.request.contextPath }/public/js/jquery-1.7.2.min.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath }/public/js/tooltips.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath }/public/js/jquery.js" type="text/javascript"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/public/js/ajax.js"></script>
	<script src="${pageContext.request.contextPath }/public/js/bootstrap.js" type="text/javascript"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/public/js/reg.js"></script>
</head>

<body>

	<!-- 顶部导航 -->
	<div id="site_nav">
			<div class="sn_container clearfix">
				<ul class="tg_tools fr">
					<li class="no-hover">
						<a id="msg_notify" class="msg_notify" href="member_message.html"></a>
					</li>
					<li class='box_color nav_home'>
						<span><a href="/eshop_v2/member_set.jsp"><span>我的账户</span></a></span><b class="icon"></b>
						<ul>
							<li>
								<a href="/eshop_v2/history.action"><span>浏览记录</span></a>
							</li>

							<li>
								<a href="/eshop_v2/cart/selectlist.action"><span>购物车(10)</span></a>
							</li>
							<li>
								<a href="javascript:exitLogin();"><span>退出登录</span></a>
							</li>
						</ul>
					</li>
					<li class="tg-line icon"></li>
					<li class='box_color'>
						<span>帮助中心</span><b class="icon"></b>
						<ul>
							<li>
								<a href="#"><span>联系我们</span></a>
							</li>
							<li>
								<a href="#"><span>关于我们</span></a>
							</li>
						</ul>
					</li>
				</ul>
				<ul class="tg_tools fl" id="login_area">
					<li class="tg_tools_home no-hover"><i class="icon-more"></i><span><a href="${pageContext.request.contextPath }/index.jsp">eshop首页</a></span></li>
					<li class="tg-line icon"></li>
						<li class="no-hover nologin"><span><a href="${pageContext.request.contextPath }/reg/login.action">新用户注册</a></span></li>
						<li class="tg-line icon"></li>
						<li class="no-hover nologin"><span><a href="${pageContext.request.contextPath }/login.jsp">亲，请先登录！</a></span></li>
				</ul>
			</div>
		</div>
				<div class="row-fluid">
		    <div class="dialog">
		        <div class="block">
		            <p class="block-heading">注册</p>
		            <div class="block-body">
		                <form>
		                    <label>会员邮箱</label>
				            <input type="text" class="span12" id="email" name="email" 
				              	title="ⓘ提示"
		            		  	data-container="body" data-toggle="popover" data-placement="right"
		            			data-content="邮箱不能为空" />
		            			
		            		<label>用户名</label>
				            <input type="text" class="span12" id="username" name="username" 
				              	title="ⓘ提示"
		            		  	data-container="body" data-toggle="popover" data-placement="right"
		            			data-content="用户名不能为空" />
		                    
		                    <label>密码</label>
		                    <input type="password" class="span12" id="password" name="password"
		                    	title="ⓘ提示"
		            		  	data-container="body" data-toggle="popover" data-placement="right"
		            			data-content="密码不能为空" />
		            		
		            		<label>重复密码</label>
		                    <input type="password" class="span12" id="password2" name="password2"
		                    	title="ⓘ提示"
		            		  	data-container="body" data-toggle="popover" data-placement="right"
		            			data-content="重复密码不能为空" />
		            			
		            		<label>性别</label>
		                                                  男 <input type="radio" class="span1" name="sex"  value="男" checked="checked" />&nbsp;&nbsp;&nbsp;&nbsp;
		                                                  女 <input type="radio" class="span1" name="sex"  value="女" />
		                                                  
		                    <label><hr /></label>
		                    
		                    
		                    <label>手机号码</label>
				            <input type="text" class="span12" id="phone" name="phone" 
				              	title="ⓘ提示"
		            		  	data-container="body" data-toggle="popover" data-placement="right"
		            			data-content="手机不能为空" />
		            			
		            		<label>收货地址</label>
				            <select name="province"  id="province" class="span5">
								
							</select>
							<select name="city"  id="city" class="span5">
								
							</select>
							<select name="area"  id="area" class="span5" style="width:230px; height:20px">
								
							</select>
							
							<label>详细地址</label>
				            <input type="text" class="span12" id="address" name="address" 
				              	title="ⓘ提示"
		            		  	data-container="body" data-toggle="popover" data-placement="right"
		            			data-content="详细地址不能为空" />
		                    
		                    <label><hr /></label>
		                    
		                    <label>密保问题</label>
				            <select name="qustion"  id="qustion" class="span12">
								
							</select>
							
							<label>答案</label>
				            <input type="text" class="span12" id="answer" name="answer" 
				              	title="ⓘ提示"
		            		  	data-container="body" data-toggle="popover" data-placement="right"
		            			data-content="答案不能为空" />
		                    
		                    
		                    <label>验证码</label>
		                    <input type="text" class="span8" id="authCode" name="authCode"
		                    	title="ⓘ提示"
		            		  	data-container="body" data-toggle="popover" data-placement="right"
		            			data-content="验证码错误" />
		                    <a href="javascript:verification()">
							<img  src="${pageContext.request.contextPath }/verification_controller/doGet.action"  id="imgCode"/>
							</a>
		                    
		                    <label><hr /></label>
		                    <a href="javascript:subReg()" class="btn btn-primary pull-right">注册</a>
		                    
		                    
		                    <div class="clearfix"></div>
		                </form>
		            </div>
		        </div>
		       
		    </div>
		</div>
<script type="text/javascript">
	
	$(function(){
		loadMethod('${pageContext.request.contextPath }');
	});
	$(function(){
		loadMethod1('${pageContext.request.contextPath }');
	});
	
</script>
		

</body>
</html>