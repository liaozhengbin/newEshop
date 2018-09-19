package cn.yunhe.eshop.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.yunhe.eshop.util.VerifyCodeUtilByYock;

import com.iyunhe.mvc.entity.YockMvcAnnotation.Controller;
import com.iyunhe.mvc.entity.YockMvcAnnotation.RequestMapping;
import com.iyunhe.mvc.entity.YockMvcAnnotation.ResponseVoid;

@Controller("/verification_controller")
public class VerificationMvc {
	
	
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