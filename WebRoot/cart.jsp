<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>eshop电子书城</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link rel="shortcut icon" href="favicon.ico" />
<link rel="stylesheet" href="public/css/style.css" type="text/css" />
<link rel="stylesheet" href="public/css/carts.css" />
<link rel="stylesheet" href="public/css/member.css" />
</head>
<body>

	<div id="site_nav">
			<div class="sn_container clearfix">
				<ul class="tg_tools fr">
					<li class="no-hover">
						<a id="msg_notify" class="msg_notify" href="member_message.html"></a>
					</li>
					<li class='box_color nav_home'>
						<span><a href="member_set.html"><span>我的账户</span></a></span><b class="icon"></b>
						<ul>
							<li>
								<a href="history.html"><span>浏览记录</span></a>
							</li>

							<li>
								<a href="cart.html"><span>购物车(10)</span></a>
							</li>
							<li>
								<a href="#"><span>退出登录</span></a>
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
					<li class="tg_tools_home no-hover"><i class="icon-more"></i><span><a href="index.html">eshop首页</a></span></li>
					<li class="tg-line icon"></li>
					<li class="no-hover nologin"><span><a href="reg.html">新用户注册</a></span></li>
					<li class="tg-line icon"></li>
					<li class="no-hover nologin"><span><a href="login.html">亲，请先登录！</a></span></li>
				</ul>
			</div>
		</div>
		<div id="header">
			<div class="tg_tools_home">
				<div class="logo">
					<a class="logo-bd" href="index.html"><img src="public/css/images/logo.png" alt="Eshop" width="75px" height="70px" /></a>
				</div>
				<form action="product_list.jsp" method="post" id="form_search" onsubmit="return searchSub()">
					<div id='search'>
						<div class="search_area">
							<input type='submit' value='搜 索' class='btn_search' />
							<div class="search_select">
								<span class="icon-search"></span>
							</div>
							<input type='text' name="keyword" value='请输入搜索内容' class="search_input" autocomplete="off" id="search_input" data-default="请输入搜索内容" 
							onblur="checkInputBlur($(this))" onfocus="checkInputFocus($(this))" />
						</div>
						<div class="search_box hide" id="search_box"></div>
						<div class='search_keywords'>
							<span>热门搜索：</span>
							<a href="product_list.jsp?keyword=手机" class="red">手机</a>
							<a href="product_list.jsp?keyword=盗墓笔记">盗墓笔记</a>
							<a href="product_list.jsp?keyword=bootstrap">bootstrap</a>
							<a href="product_list.jsp?keyword=鲁滨逊漂流记">鲁滨逊漂流记</a>
							<a href="product_list.jsp?keyword=疯狂java" class="red">疯狂java</a>
						</div>
					</div>
				</form>
			</div>
		</div>
		<div id='nav' class='nav'>
			<div class='nav_main clearfix' id="topMenu">
				<a href="index.html" class="menu current">首 页</a>
					<a href="product_list.html" class="menu">
						文学馆
					</a>
				
					<a href="product_list.html" class="menu">
						XX馆
					</a>
				
					<a href="product_list.html" class="menu">
						XX馆
					</a>
				
					<a href="product_list.html" class="menu">
						XX馆
					</a>
				
					<a href="product_list.html" class="menu">
						XX馆
					</a>
				
					<a href="product_list.html" class="menu">
						励志馆
					</a>
				
					<a href="product_list.html" class="menu">
						艺术馆
					</a>
			</div>
		</div>


	<div class="container clearfix">
		<div class="cart_main">
			<div class="titleInfoBorder">
				<span>购物车</span>
			</div>
			<section class="cartMain">
			<div class="cartMain_hd">
				<ul class="order_lists cartTop">
					<li class="list_chk">
						<!--所有商品全选--> <input type="checkbox" id="all" class="whole_check">
							<label for="all"></label>全选 
					</li>
					<li class="list_con">商品信息</li>
					<li class="list_info">商品参数</li>
					<li class="list_price">单价</li>
					<li class="list_amount">数量</li>
					<li class="list_sum">金额</li>
					<li class="list_op">操作</li>
				</ul>
			</div>

			<div class="cartBox">
				<div class="shop_info">
					<div class="all_check">
						<!--店铺全选-->
						<input type="checkbox" id="shop_a" class="shopChoice"> <label
							for="shop_a" class="shop"></label>
					</div>
					<div class="shop_name">
						店铺：<a href="javascript:;">搜猎人艺术生活</a>
					</div>
				</div>
				<div class="order_content">
					<ul class="order_lists">
						<li class="list_chk"><input type="checkbox" id="checkbox_2"
							class="son_check"> <label for="checkbox_2"></label></li>
						<li class="list_con">
							<div class="list_img">
								<a href="javascript:;"><img src="bookcover/euro.jpg" alt=""></a>
							</div>
							<div class="list_text">
								<a href="javascript:;">尼泊尔(Lonely Planet旅行指南系列)</a>
							</div>
						</li>
						<li class="list_info">
							<p>规格：默认</p>
							<p>尺寸：16*16*3(cm)</p>
						</li>
						<li class="list_price">
							<p class="price">￥980</p>
						</li>
						<li class="list_amount">
							<div class="amount_box">
								<a href="javascript:;" class="reduce reSty">-</a> <input
									type="text" value="1" class="sum"> <a
									href="javascript:;" class="plus">+</a>
							</div>
						</li>
						<li class="list_sum">
							<p class="sum_price">￥980</p>
						</li>
						<li class="list_op">
							<p class="del">
								<a href="javascript:;" class="delBtn">移除商品</a>
							</p>
						</li>
					</ul>
					<ul class="order_lists">
						<li class="list_chk"><input type="checkbox" id="checkbox_3"
							class="son_check"> <label for="checkbox_3"></label></li>
						<li class="list_con">
							<div class="list_img">
								<a href="javascript:;"><img src="bookcover/tripcn.jpg"
									alt=""></a>
							</div>
							<div class="list_text">
								<a href="javascript:;">尼泊尔(Lonely Planet旅行指南系列)</a>
							</div>
						</li>
						<li class="list_info">
							<p>规格：默认</p>
							<p>尺寸：16*16*3(cm)</p>
						</li>
						<li class="list_price">
							<p class="price">￥780</p>
						</li>
						<li class="list_amount">
							<div class="amount_box">
								<a href="javascript:;" class="reduce reSty">-</a> <input
									type="text" value="1" class="sum"> <a
									href="javascript:;" class="plus">+</a>
							</div>
						</li>
						<li class="list_sum">
							<p class="sum_price">￥780</p>
						</li>
						<li class="list_op">
							<p class="del">
								<a href="javascript:;" class="delBtn">移除商品</a>
							</p>
						</li>
					</ul>
					<ul class="order_lists">
						<li class="list_chk"><input type="checkbox" id="checkbox_6"
							class="son_check"> <label for="checkbox_6"></label></li>
						<li class="list_con">
							<div class="list_img">
								<a href="javascript:;"><img src="bookcover/photog.jpg"
									alt=""></a>
							</div>
							<div class="list_text">
								<a href="javascript:;">尼泊尔(Lonely Planet旅行指南系列)</a>
							</div>
						</li>
						<li class="list_info">
							<p>规格：默认</p>
							<p>尺寸：16*16*3(cm)</p>
						</li>
						<li class="list_price">
							<p class="price">￥180</p>
						</li>
						<li class="list_amount">
							<div class="amount_box">
								<a href="javascript:;" class="reduce reSty">-</a> <input
									type="text" value="1" class="sum"> <a
									href="javascript:;" class="plus">+</a>
							</div>
						</li>
						<li class="list_sum">
							<p class="sum_price">￥180</p>
						</li>
						<li class="list_op">
							<p class="del">
								<a href="javascript:;" class="delBtn">移除商品</a>
							</p>
						</li>
					</ul>
				</div>
			</div>

			<div class="cartBox">
				<div class="shop_info">
					<div class="all_check">
						<!--店铺全选-->
						<input type="checkbox" id="shop_b" class="shopChoice"> <label
							for="shop_b" class="shop"></label>
					</div>
					<div class="shop_name">
						店铺：<a href="javascript:;">卷卷旗舰店</a>
					</div>
				</div>
				<div class="order_content">
					<ul class="order_lists">
						<li class="list_chk"><input type="checkbox" id="checkbox_4"
							class="son_check"> <label for="checkbox_4"></label></li>
						<li class="list_con">
							<div class="list_img">
								<a href="javascript:;"><img src="bookcover/ngcn.jpg" alt=""></a>
							</div>
							<div class="list_text">
								<a href="javascript:;">尼泊尔(Lonely Planet旅行指南系列)</a>
							</div>
						</li>
						<li class="list_info">
							<p>规格：默认</p>
							<p>尺寸：16*16*3(cm)</p>
						</li>
						<li class="list_price">
							<p class="price">￥1980</p>
						</li>
						<li class="list_amount">
							<div class="amount_box">
								<a href="javascript:;" class="reduce reSty">-</a> <input
									type="text" value="1" class="sum"> <a
									href="javascript:;" class="plus">+</a>
							</div>
						</li>
						<li class="list_sum">
							<p class="sum_price">￥1980</p>
						</li>
						<li class="list_op">
							<p class="del">
								<a href="javascript:;" class="delBtn">移除商品</a>
							</p>
						</li>
					</ul>
					<ul class="order_lists">
						<li class="list_chk"><input type="checkbox" id="checkbox_5"
							class="son_check"> <label for="checkbox_5"></label></li>
						<li class="list_con">
							<div class="list_img">
								<a href="javascript:;"><img src="bookcover/travelbook.jpg"
									alt=""></a>
							</div>
							<div class="list_text">
								<a href="javascript:;">尼泊尔(Lonely Planet旅行指南系列)</a>
							</div>
						</li>
						<li class="list_info">
							<p>规格：默认</p>
							<p>尺寸：16*16*3(cm)</p>
						</li>
						<li class="list_price">
							<p class="price">￥480</p>
						</li>
						<li class="list_amount">
							<div class="amount_box">
								<a href="javascript:;" class="reduce reSty">-</a> <input
									type="text" value="1" class="sum"> <a
									href="javascript:;" class="plus">+</a>
							</div>
						</li>
						<li class="list_sum">
							<p class="sum_price">￥480</p>
						</li>
						<li class="list_op">
							<p class="del">
								<a href="javascript:;" class="delBtn">移除商品</a>
							</p>
						</li>
					</ul>
				</div>
			</div>

			<div class="cartBox">
				<div class="shop_info">
					<div class="all_check">
						<!--店铺全选-->
						<input type="checkbox" id="shop_c" class="shopChoice"> <label
							for="shop_c" class="shop"></label>
					</div>
					<div class="shop_name">
						店铺：<a href="javascript:;">卷卷旗舰店</a>
					</div>
				</div>
				<div class="order_content">
					<ul class="order_lists">
						<li class="list_chk"><input type="checkbox" id="checkbox_8"
							class="son_check"> <label for="checkbox_8"></label></li>
						<li class="list_con">
							<div class="list_img">
								<a href="javascript:;"><img src="bookcover/dulala.jpg"
									alt=""></a>
							</div>
							<div class="list_text">
								<a href="javascript:;">尼泊尔(Lonely Planet旅行指南系列)</a>
							</div>
						</li>
						<li class="list_info">
							<p>规格：默认</p>
							<p>尺寸：16*16*3(cm)</p>
						</li>
						<li class="list_price">
							<p class="price">￥1980</p>
						</li>
						<li class="list_amount">
							<div class="amount_box">
								<a href="javascript:;" class="reduce reSty">-</a> <input
									type="text" value="1" class="sum"> <a
									href="javascript:;" class="plus">+</a>
							</div>
						</li>
						<li class="list_sum">
							<p class="sum_price">￥1980</p>
						</li>
						<li class="list_op">
							<p class="del">
								<a href="javascript:;" class="delBtn">移除商品</a>
							</p>
						</li>
					</ul>
					<ul class="order_lists">
						<li class="list_chk"><input type="checkbox" id="checkbox_9"
							class="son_check"> <label for="checkbox_9"></label></li>
						<li class="list_con">
							<div class="list_img">
								<a href="javascript:;"><img src="bookcover/think.jpg" alt=""></a>
							</div>
							<div class="list_text">
								<a href="javascript:;">尼泊尔(Lonely Planet旅行指南系列)</a>
							</div>
						</li>
						<li class="list_info">
							<p>规格：默认</p>
							<p>尺寸：16*16*3(cm)</p>
						</li>
						<li class="list_price">
							<p class="price">￥480</p>
						</li>
						<li class="list_amount">
							<div class="amount_box">
								<a href="javascript:;" class="reduce reSty">-</a> <input
									type="text" value="1" class="sum"> <a
									href="javascript:;" class="plus">+</a>
							</div>
						</li>
						<li class="list_sum">
							<p class="sum_price">￥480</p>
						</li>
						<li class="list_op">
							<p class="del">
								<a href="javascript:;" class="delBtn">移除商品</a>
							</p>
						</li>
					</ul>
				</div>
			</div>
			<!--底部-->
			<div class="bar-wrapper">
				<div class="bar-right">
					<div class="piece">
						已选商品<strong class="piece_num">0</strong>件
					</div>
					<div class="totalMoney">
						共计: <strong class="total_text">0.00</strong>
					</div>
					<div class="calBtn">
						<a href="javascript:;">结算</a>
					</div>
				</div>
			</div>
			</section>
			<section class="model_bg"></section>
			<section class="my_model">
			<p class="title">
				删除宝贝<span class="closeModel">X</span>
			</p>
			<p>您确认要删除该宝贝吗？</p>
			<div class="opBtn">
				<a href="javascript:;" class="dialog-sure">确定</a><a
					href="javascript:;" class="dialog-close">关闭</a>
			</div>
			</section>

			<script src="public/js/jquery.min.js"></script>
			<script src="public/js/carts.js"></script>
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

	<script src="public/js/other/jquery_highlight.js"
		type="text/javascript"></script>
	<script src="public/js/member.js" type="text/javascript"></script>
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