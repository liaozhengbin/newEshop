<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta content="all" name="robots" />
<meta name="author" content="Fisher" />
<meta name="Copyright"
	content="Copyright 2007-2008, 版权所有 www.reefdesign.cn" />
<meta name="description" content="reefdesign" />
<meta name="keywords" content="reefdesign" />
<title>eshop电子书城</title>
<link rel="shortcut icon" href="favicon.ico" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/public/css/style.css"
	type="text/css" />
<!--头部-->
</head>
<body>

	<%
		pageContext.include("/top?method=select");
	%>



	<!-- 动态包含 -->
	<%--
		pageContext.include("/top.jsp?aaa="+111);
		<jsp:include page="/top.jsp"></jsp:include>
		
	--%>



	<!--商品展示区-->
	<div id="classify" class="tg_classify">
		<div class="tg_tab_box on">
			<div class="tg_classify_wrap clearfix">
				<dl class="tg_classify_all tg_classify_flat dl_left">
					<dt class="">
						<i class="icon_order"></i> 书籍分类
					</dt>
				</dl>
				<dl class="tg_classify_all tg_classify_flat clearfix dl_right">

					<dd class="${empty param.typeId?'on':'' }">
						<a href="${pageContext.request.contextPath }/book/list.action"><span>不限</span></a>
					</dd>
					<c:forEach items="${requestScope.typeList }" var="type">

						<dd class="${param.typeId==type.type_id?'on':'' }">
							<a
								href="${pageContext.request.contextPath }/book/list.action?typeId=${type.type_id}&typeName=${type.type_name}">
								<span>${type.type_name }</span>
							</a>
						</dd>
					</c:forEach>

				</dl>
			</div>

			<div class="tg_classify_wrap clearfix">
				<dl class="tg_classify_all tg_classify_flat dl_left">
					<dt class="">
						<i class="icon_order"></i>${param.typeName }
					</dt>
				</dl>
				<dl class="tg_classify_all tg_classify_flat clearfix dl_right">
					<dd class="${empty param.childTypeId?'on':'' }">
						<a
							href="${pageContext.request.contextPath }/book/list.action?typeId=${param.typeId }&typeName=${param.typeName }"><span>不限</span></a>
					</dd>

					<c:forEach items="${requestScope.childTypeList }" var="typeInfo">
						<dd class="${param.childTypeId==typeInfo.type_id?'on':'' }">
							<a
								href="${pageContext.request.contextPath }/book/list.action?typeId=${param.typeId }&typeName=${param.typeName }&childTypeId=${typeInfo.type_id }">
								<span>${typeInfo.type_name }</span>
							</a>
						</dd>
					</c:forEach>



				</dl>
			</div>
		</div>
	</div>

	<div id="container">
		<div id="sort" class="tg_sort clearfix">
			<div class="tg_classify_wrap">
				<dl class="tg_classify_toggle">
					<dt class="on">
						<a href="js.html?/0-0-1-0"> <i class="icon_order"></i> <span>综合</span>
							<b class="icon_order"></b>
						</a>
					</dt>
				</dl>
			</div>
			<div class="tg_classify_wrap">
				<dl class="tg_classify_toggle">
					<dt class="">
						<a href="js.html?/0-0-2-0"> <i class="icon_order"></i> <span>地区</span>
							<b class="icon_order"></b>
						</a>
					</dt>
				</dl>
			</div>
			<div class="tg_classify_wrap">
				<dl class="tg_classify_toggle">
					<dt class="">
						<a href="js.html?/0-0-3-0"> <i class="icon_order"></i> <span>人气</span>
							<b class="icon_order"></b>
						</a>
					</dt>
				</dl>
			</div>
			<div class="tg_classify_wrap">
				<dl class="tg_classify_toggle">
					<dt class="">
						<a href="js.html?/0-0-4-0"> <i class="icon_order"></i> <span>价格</span>
							<b class="icon_order"></b>
						</a>
					</dt>
				</dl>
			</div>
			<div class="tg_classify_wrap">
				<dl class="tg_classify_simplecheck">
					<dt class="">
						<a href="js.html?/0-0-6-0"> <i class="icon_order"></i> <span>销量</span>
						</a>
					</dt>
				</dl>
			</div>

			<div id="order-page" class="order-page">


				<span class="find_results_num"> 共<span class="red"> 11</span>
					商品
				</span> <span class="page-small"> <a class="prev-btn page-btn"
					href="#"> <span class="arrow-left arrow arrow-left-none"></span>
				</a> <span class="orange">1</span>/2 <a class="pnext-btn page-btn"
					href="productlist.action?typeId=3&amp;childTypeId=&amp;typeName=计算机馆&amp;currentpage=2">
						<span class="arrow-right arrow"></span>
				</a>
				</span>
			</div>

		</div>

		<div class="list">
			<div class="list_main clearfix">


				<c:forEach items="${requestScope.bookList }" var="info"
					varStatus="i">

					<div class="per" style="${(i.index+1)%4==0?'margin-right: 0':'' }">
						<a target="_blank"
							href="${pageContext.request.contextPath }/book/info.action?bookId=${info.book_id }&user_id=${sessionScope.user.user_id }"
							class="img_link"> <img
							src="${pageContext.request.contextPath }/upload/${info.book_logo_small }"
							original="#" alt="#" class="lazy">
						</a>
						<div class="foot">
							<p class="title">
								<a target="_blank" href="product_info.html">
									${info.book_name } </a>
							</p>
							<div class="statics">
								<a class="download citecommon">浏览 <em>3次</em></a> <a
									class="comment citecommon">评论 <em>4条</em></a> <a
									class="scores citecommon">售价：<em>¥${info.book_price }</em></a>
							</div>
						</div>
					</div>

				</c:forEach>

			</div>
		</div>


		
		
		
		
<div class="footer"  style="margin-left: 60px;margin-right: 60px">
<ul class="pagination pagination myul">
共<span class="red">${requestScope.num}</span>个商品

    <c:set var="formParam" value="&typeId=${param.typeId}&childTypeId=${param.childTypeId}&keyword=${param.keyword}" />
		<li class='${requestScope.currentPage==1?"disabled":""}'>
		<a href='${pageContext.request.contextPath}/${requestScope.currentPage==1?"#":"book/list.action?currentPage=1"}'>首页</a>
		</li>
		<li class='${requestScope.currentPage==1?"disabled":""}'>
		<a href='${pageContext.request.contextPath}/${requestScope.currentPage==1?"#":"book/list.action?currentPage="}${requestScope.currentPage-1}'>上一页</a>
		</li>
		<%//1>根据当前页，求出所在第几组当前组=当前页/10+1 %>
	<c:set var="hys"  >	
		<c:if test="${requestScope.currentPage%10==0}">
		 	<fmt:formatNumber value="${requestScope.currentPage/10}" pattern="#" />
		</c:if>
		<c:if test="${requestScope.currentPage%10!=0}">
			<fmt:formatNumber value="${requestScope.currentPage/10+0.5}" pattern="#" />
		</c:if>
	</c:set>		
		<%//2>显示当前组里面的所有页码号（循环）%>
		
		<c:forEach begin="${(hys-1)*10+1 }"  end="${hys*10}"  var="i" step="1">
			<c:if test="${i<=requestScope.lines }">
			<li class='${i==requestScope.currentPage?"active":"" }'><a href='${pageContext.request.contextPath}/book/list.action?currentPage=${i }'>${i }</a></li>
			</c:if>
		</c:forEach>
		
		<li class='${requestScope.currentPage==requestScope.lines?"disabled":""}'>
			<a href='${pageContext.request.contextPath}/${requestScope.currentPage==requestScope.lines?"#":"book/list.action?currentPage="}${requestScope.currentPage+1}'>下一页 </a>
		</li>
		<li class='${requestScope.currentPage==requestScope.lines?"disabled":""}'>
			<a href='${pageContext.request.contextPath }/${requestScope.currentPage==requestScope.lines?"#":"book/list.action?currentPage="}${requestScope.lines}'>末页 </a>
		</li>
     </ul>
</div>
		
		
		

	</div>

	<div class="footer" id="footer" data-url="http://www.sucaihuo.com/"
		data-logout="http://www.sucaihuo.com/Download/logout?r=" data-id=""
		data-mtype="">
		<div class="footer_main clearfix">

			<div class="friendly">
				<div class="foot_menu">
					<span class="address"> copyright ? 2013-2018
						河南云和数据信息技术有限公司深圳分公司 - Collect from <a
						href="http://www.iyunhe.com/" title="云和数据" target="_blank">云和数据</a>
						<br />粤ICP备16098514号
					</span>
				</div>
			</div>
		</div>
	</div>


	<script src="${pageContext.request.contextPath }/public/js/jquery.js"
		type="text/javascript"></script>
	<script
		src="${pageContext.request.contextPath }/public/js/other/jquery.SuperSlide.2.1.1.js"
		type="text/javascript"></script>

</body>
</html>
