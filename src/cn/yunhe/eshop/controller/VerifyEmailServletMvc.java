package cn.yunhe.eshop.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.yunhe.eshop.biz.UserBiz;
import cn.yunhe.eshop.biz.impl.UserBizImpl;
import cn.yunhe.eshop.entity.UserInfo;

import com.iyunhe.mvc.entity.ModelAndView;
import com.iyunhe.mvc.entity.YockMvcAnnotation.Controller;
import com.iyunhe.mvc.entity.YockMvcAnnotation.RequestMapping;
import com.iyunhe.mvc.entity.YockMvcAnnotation.ResponseDispatch;

@Controller("/verifyEmailServlet")
public class VerifyEmailServletMvc {
	private UserBiz userBiz=new UserBizImpl();
	
	@RequestMapping("/service.action")
	@ResponseDispatch("/index.jsp")
	public ModelAndView service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ModelAndView model=new ModelAndView();
		
		String userId=request.getParameter("userId");
		
		userBiz.validationUser(Integer.parseInt(userId));
		
		UserInfo user=userBiz.selectUser(Integer.parseInt(userId));
		model.addObject("user", user);
		
		request.getSession().setAttribute("user", user);
		
		
		return model;
		
	}

}
