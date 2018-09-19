package cn.yunhe.eshop.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import cn.yunhe.eshop.biz.ProvincesBiz;
import cn.yunhe.eshop.biz.QuestionBiz;
import cn.yunhe.eshop.biz.impl.ProvincesBizImpl;
import cn.yunhe.eshop.biz.impl.QuestionBizImpl;
import cn.yunhe.eshop.entity.ProvincesInfo;
import cn.yunhe.eshop.entity.QuestionInfo;

import com.iyunhe.mvc.entity.YockMvcAnnotation.Controller;
import com.iyunhe.mvc.entity.YockMvcAnnotation.RequestMapping;
import com.iyunhe.mvc.entity.YockMvcAnnotation.ResponseBody;

@Controller("/test")
public class TestMvcController {
	private QuestionBiz questionBiz = new QuestionBizImpl();
	private ProvincesBiz provincesBiz = new ProvincesBizImpl();

	@RequestMapping("/problem.action")
	@ResponseBody
	public String problem(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		JSONObject jo = new JSONObject();
		try {
			List<QuestionInfo> list = questionBiz.selectQuestion();
			jo.put("list", list);
			jo.put("status", 200);
		} catch (Exception e) {
			jo.put("status", 500);
		}
		return jo.toString();
	}

	// Ê¡
	@RequestMapping("/sheng.action")
	@ResponseBody
	public String sheng(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JSONObject jo = new JSONObject();
		try {
			List<ProvincesInfo> list = provincesBiz.selectProvinces();
			jo.put("list", list);
			jo.put("status", 200);
		} catch (Exception e) {
			jo.put("status", 500);
		}
		return jo.toString();
	}

	// ÊÐ
	@RequestMapping("/shi.action")
	@ResponseBody
	public String shi(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JSONObject jo = new JSONObject();
		String provinceid = request.getParameter("provinceid");
		if (provinceid == null) {
			jo.put("status", 501);
		} else {
			try {
				List<ProvincesInfo> list = provincesBiz.selectCity(provinceid);
				jo.put("list", list);
				jo.put("status", 200);
			} catch (Exception e) {
				jo.put("status", 500);
			}

		}
		return jo.toString();
	}

	// Çø
	@RequestMapping("/qu.action")
	@ResponseBody
	public String qu(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JSONObject jo = new JSONObject();
		String cityid = request.getParameter("cityid");
		if (cityid == null) {
			jo.put("status", 501);
		} else {
			try {
				List<ProvincesInfo> list = provincesBiz.selectArea(cityid);
				jo.put("list", list);
				jo.put("status", 200);
			} catch (Exception e) {
				jo.put("status", 500);
			}

		}

		return jo.toString();

	}

}
