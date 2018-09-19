package cn.yunhe.eshop.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.yunhe.eshop.biz.TypeBiz;
import cn.yunhe.eshop.biz.UserBiz;
import cn.yunhe.eshop.biz.impl.TypeBizImpl;
import cn.yunhe.eshop.biz.impl.UserBizImpl;
import cn.yunhe.eshop.entity.TypeInfo;
import cn.yunhe.eshop.entity.UserInfo;


@WebServlet("/top")
public class TopController extends HttpServlet{
	private TypeBiz typeBiz=new TypeBizImpl();
	private UserBiz userBiz=new UserBizImpl();

	/**
	 * 
	 */
	private static final long serialVersionUID = -3501315893226539349L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String method=request.getParameter("method");
		if("select".equals(method)){
			select(request, response);
			
		}
	}
	
	
	private void select(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<TypeInfo> typeList=typeBiz.selectType();
		request.setAttribute("typeList", typeList);
		UserInfo user=(UserInfo) request.getSession().getAttribute("loginUser");
		String userId=null;
		if (user==null) {
			Cookie[] cookieArray=request.getCookies();
			//去cookie的数组中，寻找userId这个cookie对象
			if (cookieArray!=null) {
				for (Cookie cookie : cookieArray) {
					if (cookie.getName().equals("userId")) {
						userId=cookie.getValue();
						break;
					}
				}
			}
			
			if (userId!=null) {
				//使用用户id去数据库查询用户对象，然后将用户对象存入session
				user=userBiz.selectUser(Integer.parseInt(userId));
				request.getSession().setAttribute("user", user);
			}
			
		}
		
		
		
		
		request.getRequestDispatcher("/WEB-INF/jsp/top.jsp").include(request,response );
	}
	
	
	

}
