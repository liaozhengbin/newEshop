<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="site_nav">

		<div class="sn_container clearfix">
			<ul class="tg_tools fr">
				<li class="no-hover"><a id="msg_notify" class="msg_notify"
					href="member_message.jsp"></a></li>
				<li class='box_color nav_home'><span><a
						href="${pageContext.request.contextPath }/user/member.action"><span>我的账户</span></a></span><b
					class="icon"></b>
					<ul>
						<li><a href="${pageContext.request.contextPath }/book/history.action?user_id=${sessionScope.user.user_id }"><span>浏览记录</span></a></li>

						<li><a href="cart.jsp"><span>购物车(10)</span></a></li>
						<li><a
							href="javascript:removeCookie()"><span>退出登录</span></a>
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
				<c:if test="${empty sessionScope.user }">
					<li class="no-hover nologin"><span><a
							href="${pageContext.request.contextPath }/reg/login.action">新用户注册</a></span></li>
					<li class="tg-line icon"></li>
				</c:if>
				<li class="no-hover nologin"><span> <c:if
							test="${empty sessionScope.user }">
							<a href="${pageContext.request.contextPath }/login.jsp">亲，请先登录！</a>
						</c:if> <c:if test="${!empty sessionScope.user }">
							<a href="${pageContext.request.contextPath }/user/member.action">欢迎您！${sessionScope.user.user_name }</a>
						</c:if>
				</span></li>
			</ul>
		</div>
	</div>
	<div id="header">
		<div class="tg_tools_home">
			<div class="logo">
				<a class="logo-bd" href="index.html"><img
					src="${pageContext.request.contextPath }/public/css/images/logo.png" alt="Eshop" width="75px"
					height="70px" /></a>
			</div>
			<form action="${pageContext.request.contextPath }/book/list.action" method="post" id="form_search"
				onsubmit="return searchSub()">
				<div id='search'>
					<div class="search_area">
						<input type='submit' value='搜 索' class='btn_search' />
						<div class="search_select">
							<span class="icon-search"></span>
						</div>
						<input type='text' name="keyword" value="${!empty param.keyword?param.keyword:'请输入搜索内容' }"
							class="search_input" autocomplete="off" id="search_input"
							data-default="请输入搜索内容" onblur="checkInputBlur($(this))"
							onfocus="checkInputFocus($(this))" />
					</div>
					<div class="search_box hide" id="search_box"></div>
					<div class='search_keywords'>
						<span>热门搜索：</span> <a href="product_list.jsp?keyword=手机"
							class="red">手机</a> <a href="product_list.jsp?keyword=盗墓笔记">盗墓笔记</a>
						<a href="product_list.jsp?keyword=bootstrap">bootstrap</a> <a
							href="product_list.jsp?keyword=鲁滨逊漂流记">鲁滨逊漂流记</a> <a
							href="product_list.jsp?keyword=疯狂java" class="red">疯狂java</a>
					</div>
				</div>
			</form>
		</div>
	</div>
	<c:if test='${!fn:endsWith(pageContext.request.requestURI,"product_info.jsp") }'>
	<div id='nav' class='nav'>
		<div class='nav_main clearfix' id="topMenu">
			<a href="${pageContext.request.contextPath }/index.jsp"
				class="${empty param.typeId?'menu current':'menu' }">首 页</a>

			<c:forEach items="${requestScope.typeList }" var="typeInfo">
				<c:set var="selectedType">
							${param.typeId==typeInfo.type_id?"menu current":"menu" }
						</c:set>
				<a
					href="${pageContext.request.contextPath }/book/list.action?typeId=${typeInfo.type_id }"
					class="${selectedType }"> ${typeInfo.type_name } </a>
			</c:forEach>

		</div>
	</div>
	</c:if>
</body>
</html>