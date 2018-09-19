package cn.yunhe.eshop.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.yunhe.eshop.biz.BookBiz;
import cn.yunhe.eshop.biz.TypeBiz;
import cn.yunhe.eshop.biz.UserBookBiz;
import cn.yunhe.eshop.biz.impl.BookBizImpl;
import cn.yunhe.eshop.biz.impl.TypeBizImpl;
import cn.yunhe.eshop.biz.impl.UserBookBizImpl;
import cn.yunhe.eshop.entity.BookInfo;
import cn.yunhe.eshop.entity.TypeInfo;
import cn.yunhe.eshop.entity.UserBookInfo;

import com.iyunhe.mvc.entity.ModelAndView;
import com.iyunhe.mvc.entity.YockMvcAnnotation.Controller;
import com.iyunhe.mvc.entity.YockMvcAnnotation.RequestMapping;
import com.iyunhe.mvc.entity.YockMvcAnnotation.ResponseDispatch;

@Controller("/book")
public class BookController {
	private TypeBiz typeBiz=new TypeBizImpl();
	private BookBiz bookBiz=new BookBizImpl();
	private UserBookBiz userBookBiz=new UserBookBizImpl();
	
	@RequestMapping("/list.action")
	@ResponseDispatch("/WEB-INF/jsp/product_list.jsp")
	public ModelAndView selctList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String typeId=request.getParameter("typeId");
		System.out.println(typeId);
		String childTypeId=request.getParameter("childTypeId");
		System.out.println(childTypeId);
		String keyword=request.getParameter("keyword");
		System.out.println(keyword);
		String newCurrentPage=request.getParameter("currentPage");
		
		
		ModelAndView model=new ModelAndView();
		
		
		//Ĭ�ϵ�1ҳ
		int currentPage=newCurrentPage==null?1:Integer.parseInt(newCurrentPage);
		
		System.out.println(currentPage);
		model.addObject("currentPage", currentPage);
		//ÿҳ12��
		int line=8;
		
		//�ܼ�¼��
		int num=bookBiz.selectBookNum(typeId,childTypeId,keyword);
		model.addObject("num", num);
		//��ҳ��
		int lines=bookBiz.selectBookIndex(typeId,childTypeId,keyword,line);
		model.addObject("lines", lines);
		
		
		//��ѯ�鼮�б�
		List<BookInfo> bookList=bookBiz.selectBookList(typeId,childTypeId,keyword,currentPage,line);
		model.addObject("bookList", bookList);
		

		//��ѯһ�������б�
		List<TypeInfo> typeList=typeBiz.selectType();
		model.addObject("typeList", typeList);
		
		if (typeId!=null) {
			//��ѯ���������б�
			List<TypeInfo> childTypeList = typeBiz.selectListByParentId(Integer.parseInt(typeId));
			model.addObject("childTypeList", childTypeList);
		}
		
		return model;
	}
	
	
	@RequestMapping("/info.action")
	@ResponseDispatch("/WEB-INF/jsp/product_info.jsp")
	public ModelAndView selctInfo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String bookId=request.getParameter("bookId");
		String user_id=request.getParameter("user_id");
		
		
		
		ModelAndView model=new ModelAndView();
		if(user_id!=null){
			//��ѯ��������鼮��Ϣ�Ƿ�����ʷ��¼��
			UserBookInfo userBookInfo=userBookBiz.selectUserBook(Integer.parseInt(user_id),Integer.parseInt(bookId));
			if(userBookInfo==null){
				//��Ӹ�������鼮��Ϣ����ʷ��¼��
				userBookBiz.addUserBook(Integer.parseInt(user_id),Integer.parseInt(bookId));
			}
		}
		
		
		
		//��ѯ�鼮��Ϣ
		BookInfo bookInfo=bookBiz.selectBookInfo(Integer.parseInt(bookId));
		model.addObject("bookInfo", bookInfo);
		
		
		//��ѯ�鼮����ͼ�б�
		List<String> picList=bookBiz.selectBookPicList(Integer.parseInt(bookId));
		model.addObject("picList", picList);
		
		return model;
	}
	
	
	@RequestMapping("/history.action")
	@ResponseDispatch("/WEB-INF/jsp/history.jsp")
	public ModelAndView history(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ModelAndView model=new ModelAndView();
		String user_id=request.getParameter("user_id");
		String bookId=request.getParameter("bookId");
		if(user_id!=null){
			
			if(bookId!=null){
				userBookBiz.updateUserBook(Integer.parseInt(user_id),Integer.parseInt(bookId));
			}
			
			//��ѯ��ʷ�鼮�б�
			List<BookInfo> bookList=bookBiz.selectBookHistory(Integer.parseInt(user_id));
			model.addObject("bookList", bookList);
		}
		return model;
	}
	
	
}
