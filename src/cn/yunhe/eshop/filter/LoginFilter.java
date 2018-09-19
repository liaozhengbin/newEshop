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
		
		////��ȡ�����·����ַ��ɸѡ����Щ����ص�·��
		String requestPath=httpRequest.getRequestURI();
		if(	requestPath.endsWith("commentlist.jsp") ||
			requestPath.endsWith("favoritelist.jsp") ||
			requestPath.endsWith("user") ||
			requestPath.endsWith("orderlist.jsp") 
				){////��ȡ�����·����ַ��ɸѡ����Щ����ص�·��
			
			if (requestPath.endsWith("user")) {
				
				String method=httpRequest.getParameter("method");
				System.out.println(method);
				if (!"member".equals(method)) {
					//����
					chain.doFilter(httpRequest, httpResponse);
					return;
				}
			}
			
			
			
				
			 UserInfo user=(UserInfo)httpRequest.getSession().getAttribute("user");
			if(user==null){
				
				//ȥcookieȥ��userId
		    	String userId=null;
			    Cookie[] cookieArray=httpRequest.getCookies();
			    if(cookieArray!=null){
			    	 for(Cookie cookie:cookieArray){
			 	    	if("userID".equals(cookie.getName())){//ɸѡ���ˡ�userID�����cookie����
			 	    		userId=cookie.getValue();
			 	    	}
			 	    }
			    }
				if(userId==null){
					//δ��¼��ת����¼ҳ��
					httpRequest.getSession().setAttribute("loginReturnURL", requestPath+"?"+httpRequest.getQueryString());
					httpRequest.getRequestDispatcher("login.jsp").forward(httpRequest, httpResponse);
				}else{//�ѵ�¼��cookie����userId��
					//����
					chain.doFilter(httpRequest, httpResponse);
				}
			}else{//�ѵ�¼
				//����
				chain.doFilter(httpRequest, httpResponse);
			}
		}else{//�롰��¼״̬���޹ص�
			//����
			chain.doFilter(httpRequest, httpResponse);
		}
		
		
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
