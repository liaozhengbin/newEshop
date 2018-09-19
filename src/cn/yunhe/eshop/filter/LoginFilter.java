package cn.yunhe.eshop.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.yunhe.eshop.biz.UserBiz;
import cn.yunhe.eshop.biz.impl.UserBizImpl;
import cn.yunhe.eshop.entity.UserInfo;

public class LoginFilter implements Filter{
	private UserBiz userBiz=new UserBizImpl();
	
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest httpRequest=(HttpServletRequest)request;
		HttpServletResponse httpResponse=(HttpServletResponse)response;
		
		////获取请求的路径地址，筛选出哪些是相关的路径
		String requestPath=httpRequest.getRequestURI();
		if(	requestPath.endsWith("commentlist.jsp") ||
			requestPath.endsWith("favoritelist.jsp") ||
			requestPath.endsWith("user") ||
			requestPath.endsWith("orderlist.jsp") 
				){////获取请求的路径地址，筛选出哪些是相关的路径
			
			if (requestPath.endsWith("user")) {
				
				String method=httpRequest.getParameter("method");
				System.out.println(method);
				if (!"member".equals(method)) {
					//放行
					chain.doFilter(httpRequest, httpResponse);
					return;
				}
			}
			
			
			
				
			 UserInfo user=(UserInfo)httpRequest.getSession().getAttribute("user");
			if(user==null){
				
				//去cookie去找userId
		    	String userId=null;
			    Cookie[] cookieArray=httpRequest.getCookies();
			    if(cookieArray!=null){
			    	 for(Cookie cookie:cookieArray){
			 	    	if("userID".equals(cookie.getName())){//筛选出了“userID”这个cookie对象
			 	    		userId=cookie.getValue();
			 	    	}
			 	    }
			    }
				if(userId==null){
					//未登录跳转到登录页面
					httpRequest.getSession().setAttribute("loginReturnURL", requestPath+"?"+httpRequest.getQueryString());
					httpRequest.getRequestDispatcher("login.jsp").forward(httpRequest, httpResponse);
				}else{//已登录（cookie中有userId）
					//放行
					chain.doFilter(httpRequest, httpResponse);
				}
			}else{//已登录
				//放行
				chain.doFilter(httpRequest, httpResponse);
			}
		}else{//与“登录状态”无关的
			//放行
			chain.doFilter(httpRequest, httpResponse);
		}
		
		
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
