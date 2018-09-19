<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>eshop电子书城</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link rel="shortcut icon" href="favicon.ico" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/public/css/style.css" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/public/css/carts.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/public/css/member.css" />
</head>
<body>

	<%
		pageContext.include("/top?method=select");
		%>


	<div class="container clearfix">
		<div class="cart_main">
			<div class="titleInfoBorder">
				<span>历史记录</span>
			</div>
			<section class="cartMain">
			<div class="cartMain_hd">
				<ul class="order_lists cartTop">
					<li class="list_chk">
						<input type="checkbox" id="all" class="whole_check">
						<label for="all"></label>全选 
					</li>
					<li class="list_con">商品信息</li>
					<li class="list_price">单价</li>
					<li class="list_info">作者</li>
					<li class="list_info">出版社</li>
				</ul>
			</div>

			<div class="cartBox">
				<div class="order_content">
				
				<c:forEach items="${requestScope.bookList}" var="book"  >
					<ul class="order_lists">
						<li class="list_chk">
						<input type="checkbox" id="checkbox_2" class="son_check" value="${book.book_id }">
						<label for="checkbox_2"></label>
						</li>
						
					
						
							
						<li class="list_con">
							<div class="list_img">
								<a href="javascript:;"><img src="${pageContext.request.contextPath }/upload/${book.book_logo_small }" alt=""></a>
							
							</div>
							<div class="list_text">
								<a href="javascript:;">${book.book_name }</a>
							</div>
						</li>
						<li class="list_price">
							<p class="price">￥${book.book_price }</p>
						</li>
						<li class="list_info">
							${book.book_author }
						</li>
						<li class="list_info">
							${book.book_press }
						</li>
						
						
					</ul>
					</c:forEach>
					
					
					
					
				</div>
				
				<br />
				 <input type="button" tabindex="7" value="删&nbsp;&nbsp;除" class="btn_reg btn" id="btn_reg" />
				 
				 <div class="pager">
					共<span class="red"> 659 </span>个商品 
					<a class="prev" href="js.html?/0-0-0-1">上一页</a> 
					<a class="current">1</a>
					<a class="num" href="js.html?/0-0-0-2">2</a>
					<a class="num" href="js.html?/0-0-0-3">3</a>
					<a class="num" href="js.html?/0-0-0-4">4</a>
					<a class="num" href="js.html?/0-0-0-5">5</a>
					<a class="num" href="js.html?/0-0-0-6">6</a>
					<a class="num" href="js.html?/0-0-0-7">7</a
					><a class="num" href="js.html?/0-0-0-8">8</a>
					<a class="num" href="js.html?/0-0-0-9">9</a>
					<a class="num" href="js.html?/0-0-0-10">10</a>
					<a class="end" href="js.html?/0-0-0-33">...33</a> 
					<a class="next" href="js.html?/0-0-0-2">下一页</a>
				</div>
			</div>

			<script src="${pageContext.request.contextPath }/public/js/jquery.min.js"></script>
			<script src="${pageContext.request.contextPath }/public/js/carts.js"></script>
		</div>
	</div>

	<div class="footer" id="footer" data-url="http://www.sucaihuo.com/" data-logout="http://www.sucaihuo.com/Download/logout?r=" data-id="" data-mtype="">
			<div class="footer_main clearfix">
				
				<div class="friendly">
					<div class="foot_menu">
						<span class="address">
							copyright ? 2013-2018 河南云和数据信息技术有限公司深圳分公司  - Collect from 
							<a href="http://www.iyunhe.com/" title="云和数据" target="_blank">云和数据</a>
							<br />粤ICP备16098514号
						</span>
					</div>
				</div>
			</div>
	</div>

	<script src="${pageContext.request.contextPath }/public/js/other/jquery_highlight.js"
		type="text/javascript"></script>
	<script src="${pageContext.request.contextPath }/public/js/member.js" type="text/javascript"></script>
	<div class="mmsg-box mmsg-box-info" id='msg-box'
		style="margin-top: -23.5px; margin-left: -96.5px;">
		<div class="mmsg-content">
			<i class="mmsg-icon"></i>
			<p id='msg-box-content'></p>
		</div>
		<div class="mmsg-background"></div>
	</div>
</body>
</html>