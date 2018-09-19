package cn.yunhe.eshop.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import cn.yunhe.eshop.biz.QuestionBiz;
import cn.yunhe.eshop.biz.UserBiz;
import cn.yunhe.eshop.biz.impl.QuestionBizImpl;
import cn.yunhe.eshop.biz.impl.UserBizImpl;
import cn.yunhe.eshop.entity.QuestionInfo;
import cn.yunhe.eshop.util.MailUtilByYock;

import com.iyunhe.mvc.entity.ModelAndView;
import com.iyunhe.mvc.entity.YockMvcAnnotation.Controller;
import com.iyunhe.mvc.entity.YockMvcAnnotation.RequestMapping;
import com.iyunhe.mvc.entity.YockMvcAnnotation.ResponseBody;
import com.iyunhe.mvc.entity.YockMvcAnnotation.ResponseDispatch;

@Controller("/user")
public class UserMvcController {
	private UserBiz userBiz = new UserBizImpl();
	private QuestionBiz questionBiz = new QuestionBizImpl();

	@RequestMapping("/add.action")
	@ResponseBody
	public String add(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JSONObject jo = new JSONObject();
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		String phone = request.getParameter("phone");
		String province = request.getParameter("province");
		String city = request.getParameter("city");
		String area = request.getParameter("area");
		String address = request.getParameter("address");
		String qustion = request.getParameter("qustion");
		String answer = request.getParameter("answer");
		try {
			int user_id = userBiz.addUser(email, username, password, sex,
					phone, Integer.parseInt(qustion), answer);
			String host = request.getServerName();
			int port = request.getServerPort();
			String projectName = request.getContextPath();
			String fullURL = "http://" + host + ":" + port + projectName
					+ "/verifyEmailServlet?userId=" + user_id;
			String contents = "�װ���" + email + "�����ã�<br />"
					+ "�Ѿ��յ�������ע����Ϣ����������ȷ�����ӣ���������EShop�˺ţ�<br />" + "<a href='"
					+ fullURL + "'>"
					+ "<h3 style='color:red'>���ע�ᣬ������������֮��</h3>"
					+ "</a>������ܵ�������ӵ�ַ���뽫������Ϣ���Ʋ�ճ����������ĵ�ַ�����<br />" + fullURL;
			MailUtilByYock.sendMail(email, username, "�����EShop�û�ע�ᣨ���ԣ�",
					contents);
			jo.put("status", 200);
		} catch (Exception e) {
			jo.put("status", 500);
		}

		return jo.toString();

	}
	
	@RequestMapping("/member.action")
	@ResponseDispatch("/WEB-INF/jsp/member_set.jsp")
	public ModelAndView member(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<QuestionInfo> questionList=questionBiz.selectQuestion();
		request.setAttribute("questionList", questionList);
		ModelAndView model=new ModelAndView();
		return model;
	}
	
	
	@RequestMapping("/selectEmail.action")
	@ResponseBody
	public String selectEmail(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email=request.getParameter("email");
		boolean isEmail=userBiz.selectEmail(email);
		//��Ӧ���ͻ���
		
		return isEmail?"1":"0";
		
	}
	
	@RequestMapping("/selectUserName.action")
	@ResponseBody
	public String selectUserName(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username=request.getParameter("username");
		boolean isName=userBiz.selectUserName(username);
		//��Ӧ���ͻ���
		
		return isName?"1":"0";
		
	}

}
