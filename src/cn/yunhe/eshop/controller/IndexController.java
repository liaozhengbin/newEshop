package cn.yunhe.eshop.controller;

import java.io.IOException;
import java.util.List;




import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import cn.yunhe.eshop.biz.BookBiz;
import cn.yunhe.eshop.biz.impl.BookBizImpl;
import cn.yunhe.eshop.entity.BookInfo;



@WebServlet("/index")
public class IndexController extends HttpServlet{
	private BookBiz bookBiz=new BookBizImpl();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 766298358118081722L;
	
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String method = request.getParameter("method");
		if ("login".equals(method)) {
			login(request, response);
		} 
	
		
	}
	
	private void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JSONObject jo=new JSONObject();
		// TODO Auto-generated method stub
		
		try {
			List<BookInfo> bookList=bookBiz.selectBook();
			jo.put("bookList", bookList);
			jo.put("status", 200);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			jo.put("status", 500);
		}
		
		response.getWriter().print(jo.toString());
	}
	
}
