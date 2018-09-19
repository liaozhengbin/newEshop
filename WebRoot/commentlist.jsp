<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
        <title>eshop电子书城</title>
        <meta name="keywords" content="" /> 
        <meta name="description" content="" /> 
        <link rel="shortcut icon" href="favicon.ico" />
        <link rel="stylesheet" href="public/css/style.css" type="text/css" /> 
                
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
				<form action="product_list.html" method="post" id="form_search" onsubmit="return searchSub()">
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
							<a href="product_list.html?keyword=手机" class="red">手机</a>
							<a href="product_list.html?keyword=盗墓笔记">盗墓笔记</a>
							<a href="product_list.html?keyword=bootstrap">bootstrap</a>
							<a href="product_list.html?keyword=鲁滨逊漂流记">鲁滨逊漂流记</a>
							<a href="product_list.html?keyword=疯狂java" class="red">疯狂java</a>
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
        
        
<link href="public/css/member.css" rel="stylesheet" type="text/css" />
<div class="container clearfix">
    
    <div class="member_right">
    <div class="member_per">
        <div class="panel clearfix">
            <div class="panel-info clearfix">
                <a href="member_avatar.html"><img class="round-image" width="50" height="50" src="public/css/images/temp.png" alt="头像"></a>
                <div class="name-job">
                    <h4 class="myname"> feelsoright </h4>
                    <p class="job-title"> feelsoright </p>
                </div>
            </div>
            <div class="sign-wrap">
                <textarea id="signed_textarea" class="signed_textarea"  disabled autocomplete="off">继续来吧.</textarea>
                <em id="signed_edit" class="signed_edit"></em>
            </div>
            <p id="signed_error" class="signed_error"></p>
        </div>
    </div>
    <div class="member_per">
        <ul class="nav panel">
       	 	<li>
                <a href="member_set.html"><i class="icon-nav icon-note"></i>我的设置</a>
            </li>
            <li>
                <a href="orderlist.html"><i class="icon-nav icon-tick"></i>我的订单</a>
            </li> 
            <li>
                <a href="commentlist.html"><i class="icon-nav icon-plan"></i>我的评价</a>
            </li>
           <li style='border-bottom: none'>
                <a href="favoritelist.html"><i class="icon-nav icon-ques"></i>我的收藏</a>
           </li>
        </ul>
    </div>
    <div class="member_per">
        <ul class="space-data panel">
            <li>
                <span class="icon-clock icon" title="购买"></span>
                购买：
                <a href="#">53件商品</a>
            </li>
            <li>
                <span class="icon-tick icon" title="收藏"></span>
                收藏：
                <a  href="#">3件商品</a>
            </li>
            <li>
                <span class="icon-tick icon" title="购物车"></span>
                购物车：
                <a class="countNote" href="#">15件商品</a>
            </li>

        </ul>
    </div>
</div>
    
    <div class="member_main">
        <div class="perInfo">
            <div class="titleInfoBorder">
                <span>我的评价</span>
            </div>
        </div>
        
        
        <!-- 评论1 -->
            	<div class="infoPerBlock infoCommentBlock ">
            		<div class="leftPicBlock">
                        <a href="member_index.html">
                            <img src="ad/book1.jpg" width="80px" height="80px" title="头像" alt="头像" />
                        </a>
                    </div>
                    <div class="centerBlock">
                        <span class="title">
                        	<a class="blue" target="_blank" href="http://www.sucaihuo.com/space/uid/1528">sunhine</a>
                        	评论说：
                    	</span>
                        <div class="infoNews">
                        	你应该说的是弹窗iframe.本文演示的是弹出层（div）,没有浏览器会禁止弹出层的。
                        	你应该说的是弹窗iframe.本文演示的是弹出层（div）,没有浏览器会禁止弹出层的。
                        	你应该说的是弹窗iframe.本文演示的是弹出层（div）,没有浏览器会禁止弹出层的。
                        </div>
                        <div class="objectBlock">
                            <span class="pic">
                                <a target="_blank" href="js.html?/567">
                                    <img width="50px" height="50px" style="margin-top:0px" alt="jQuery+Ajax" src="public/css/images/nba.png">
                                </a>
                            </span>
                            &nbsp;&nbsp;
                            <span class="pic">
                                <a target="_blank" href="js.html?/567">
                                    <img width="50px" height="50px" style="margin-top:0px" alt="jQuery+Ajax" src="public/css/images/nba.png">
                                </a>
                            </span>
                            &nbsp;&nbsp;
                            <span class="pic">
                                <a target="_blank" href="js.html?/567">
                                    <img width="50px" height="50px" style="margin-top:0px" alt="jQuery+Ajax" src="public/css/images/nba.png">
                                </a>
                            </span>
                        </div>
                    </div>
                    <div class="rightBlock">
                        <span class="time">01-21 08:24</span>
                    </div>
                    <div class="clear"></div>
                </div>
                
                <!-- 评论1 -->
            	<div class="infoPerBlock infoCommentBlock ">
            		<div class="leftPicBlock">
                        <a href="member_index.html">
                            <img src="ad/book1.jpg" width="80px" height="80px" title="头像" alt="头像" />
                        </a>
                    </div>
                    <div class="centerBlock">
                        <span class="title">
                        	<a class="blue" target="_blank" href="http://www.sucaihuo.com/space/uid/1528">sunhine</a>
                        	评论说：
                    	</span>
                        <div class="infoNews">
                        	你应该说的是弹窗iframe.本文演示的是弹出层（div）,没有浏览器会禁止弹出层的。
                        	你应该说的是弹窗iframe.本文演示的是弹出层（div）,没有浏览器会禁止弹出层的。
                        	你应该说的是弹窗iframe.本文演示的是弹出层（div）,没有浏览器会禁止弹出层的。
                        </div>
                        <div class="objectBlock">
                            <span class="pic">
                                <a target="_blank" href="js.html?/567">
                                    <img width="50px" height="50px" style="margin-top:0px" alt="jQuery+Ajax" src="public/css/images/nba.png">
                                </a>
                            </span>
                            &nbsp;&nbsp;
                            <span class="pic">
                                <a target="_blank" href="js.html?/567">
                                    <img width="50px" height="50px" style="margin-top:0px" alt="jQuery+Ajax" src="public/css/images/nba.png">
                                </a>
                            </span>
                            &nbsp;&nbsp;
                            <span class="pic">
                                <a target="_blank" href="js.html?/567">
                                    <img width="50px" height="50px" style="margin-top:0px" alt="jQuery+Ajax" src="public/css/images/nba.png">
                                </a>
                            </span>
                        </div>
                    </div>
                    <div class="rightBlock">
                        <span class="time">01-21 08:24</span>
                    </div>
                    <div class="clear"></div>
                </div>
                
                <!-- 评论1 -->
            	<div class="infoPerBlock infoCommentBlock ">
            		<div class="leftPicBlock">
                        <a href="member_index.html">
                            <img src="ad/book1.jpg" width="80px" height="80px" title="头像" alt="头像" />
                        </a>
                    </div>
                    <div class="centerBlock">
                        <span class="title">
                        	<a class="blue" target="_blank" href="http://www.sucaihuo.com/space/uid/1528">sunhine</a>
                        	评论说：
                    	</span>
                        <div class="infoNews">
                        	你应该说的是弹窗iframe.本文演示的是弹出层（div）,没有浏览器会禁止弹出层的。
                        	你应该说的是弹窗iframe.本文演示的是弹出层（div）,没有浏览器会禁止弹出层的。
                        	你应该说的是弹窗iframe.本文演示的是弹出层（div）,没有浏览器会禁止弹出层的。
                        </div>
                        <div class="objectBlock">
                            <span class="pic">
                                <a target="_blank" href="js.html?/567">
                                    <img width="50px" height="50px" style="margin-top:0px" alt="jQuery+Ajax" src="public/css/images/nba.png">
                                </a>
                            </span>
                            &nbsp;&nbsp;
                            <span class="pic">
                                <a target="_blank" href="js.html?/567">
                                    <img width="50px" height="50px" style="margin-top:0px" alt="jQuery+Ajax" src="public/css/images/nba.png">
                                </a>
                            </span>
                            &nbsp;&nbsp;
                            <span class="pic">
                                <a target="_blank" href="js.html?/567">
                                    <img width="50px" height="50px" style="margin-top:0px" alt="jQuery+Ajax" src="public/css/images/nba.png">
                                </a>
                            </span>
                        </div>
                    </div>
                    <div class="rightBlock">
                        <span class="time">01-21 08:24</span>
                    </div>
                    <div class="clear"></div>
                </div>           
                
           
           <div class="pager">  
           		<a class="current">1</a><a class="num" href="http://www.sucaihuo.com/Member/comments/p/2.html">2</a><a class="num" href="http://www.sucaihuo.com/Member/comments/p/3.html">3</a><a class="num" href="http://www.sucaihuo.com/Member/comments/p/4.html">4</a><a class="num" href="http://www.sucaihuo.com/Member/comments/p/5.html">5</a><a class="num" href="http://www.sucaihuo.com/Member/comments/p/6.html">6</a><a class="num" href="http://www.sucaihuo.com/Member/comments/p/7.html">7</a><a class="num" href="http://www.sucaihuo.com/Member/comments/p/8.html">8</a><a class="num" href="http://www.sucaihuo.com/Member/comments/p/9.html">9</a><a class="num" href="http://www.sucaihuo.com/Member/comments/p/10.html">10</a><a class="num" href="http://www.sucaihuo.com/Member/comments/p/11.html">11</a>  <a class="next" href="http://www.sucaihuo.com/Member/comments/p/2.html">下一页</a>
           </div>
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

<script src="public/js/other/jquery_highlight.js" type="text/javascript"></script>
<script src="public/js/member.js" type="text/javascript"></script>
<div class="mmsg-box mmsg-box-info" id='msg-box' style="margin-top: -23.5px; margin-left: -96.5px;">
    <div class="mmsg-content">
        <i class="mmsg-icon"></i>
        <p id='msg-box-content'></p>
    </div>
    <div class="mmsg-background"></div>
</div>