package cn.yunhe.eshop.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iyunhe.mvc.entity.ModelAndView;
import com.iyunhe.mvc.entity.YockMvcAnnotation.Controller;
import com.iyunhe.mvc.entity.YockMvcAnnotation.RequestMapping;
import com.iyunhe.mvc.entity.YockMvcAnnotation.ResponseDispatch;
import com.iyunhe.mvc.entity.YockMvcAnnotation.ResponseVoid;

import cn.yunhe.eshop.biz.QuestionBiz;
import cn.yunhe.eshop.biz.impl.QuestionBizImpl;
import cn.yunhe.eshop.entity.QuestionInfo;
import cn.yunhe.eshop.util.VerifyCodeUtilByYock;

@Controller("/reg")
public class RegMvcController {
	private QuestionBiz questionBiz=new QuestionBizImpl();
	
	@RequestMapping("/login.action")
	@ResponseDispatch("/WEB-INF/jsp/reg.jsp")
	public ModelAndView exit(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<QuestionInfo> questionList=questionBiz.selectQuestion();
		request.setAttribute("questionList", questionList);
		ModelAndView model=new ModelAndView();
		return model;
	}
	
	
	@RequestMapping("/doGet.action")
	@ResponseVoid
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//���ò�����
		response.setDateHeader("expries", -1);
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Pragma", "no-cache");
		
		//����4λ�����
		String code=VerifyCodeUtilByYock.generateVerifyCode(4);
		//����������session
		request.getSession().setAttribute("code", code);
		
		VerifyCodeUtilByYock.outputImageStream(200, 80, response.getOutputStream(), code);
		
	}
	
	
}
