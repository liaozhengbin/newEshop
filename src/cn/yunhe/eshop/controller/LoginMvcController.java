package cn.yunhe.eshop.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;
import cn.yunhe.eshop.biz.UserBiz;
import cn.yunhe.eshop.biz.impl.UserBizImpl;
import cn.yunhe.eshop.entity.UserInfo;

import com.iyunhe.mvc.entity.ModelAndView;
import com.iyunhe.mvc.entity.YockMvcAnnotation.Controller;
import com.iyunhe.mvc.entity.YockMvcAnnotation.RequestMapping;
import com.iyunhe.mvc.entity.YockMvcAnnotation.ResponseBody;
import com.iyunhe.mvc.entity.YockMvcAnnotation.ResponseDispatch;
import com.iyunhe.mvc.entity.YockMvcAnnotation.ResponseVoid;

@Controller("/login")
public class LoginMvcController {
	private UserBiz userBiz = new UserBizImpl();

	@RequestMapping("/login.action")
	@ResponseBody
	public String login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JSONObject jo = new JSONObject();
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		String authCode = request.getParameter("authCode");// 用户输入的验证码
		String serverCode = (String) request.getSession().getAttribute("code");// 随机生成的4位验证码
		if (serverCode.equalsIgnoreCase(authCode)) {
			UserInfo user = userBiz.validationUser(username, pwd);
			if (user == null) {
				// 帐号或密码错误
				jo.put("status", 502);
			} else {

				if (user.getIs_activated() == 1) {
					request.getSession().setAttribute("user", user);
					String loginReturnURL = (String) request.getSession()
							.getAttribute("loginReturnURL");
					jo.put("loginReturnURL", loginReturnURL);
					jo.put("user_id", user.getUser_id());
					jo.put("status", 200);
				}

			}
		} else {
			// 验证码错误
			jo.put("status", 501);
		}

		return jo.toString();
	}

	@RequestMapping("/exit.action")
	@ResponseBody
	public String exit(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		JSONObject jo = new JSONObject();
		// 销毁session
		HttpSession session = request.getSession();
		session.invalidate();
	
		jo.put("status", 200);
		
		return jo.toString();
	}

	

	@RequestMapping("/validation.action")
	@ResponseBody
	public String validation(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String authCode = request.getParameter("authCode");// 用户输入的验证码
		String serverCode = (String) request.getSession().getAttribute("code");// 随机生成的4位验证码
		request.getSession().removeAttribute("serverCode");

		if (serverCode.equalsIgnoreCase(authCode)) {
			return "1";
		} else {
			return "0";
		}

	}

}
