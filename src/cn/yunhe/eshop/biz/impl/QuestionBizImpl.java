package cn.yunhe.eshop.biz.impl;

import java.util.List;

import cn.yunhe.eshop.biz.QuestionBiz;
import cn.yunhe.eshop.dao.QuestionDao;
import cn.yunhe.eshop.dao.impl.QuestionDaoImpl;
import cn.yunhe.eshop.entity.QuestionInfo;

public class QuestionBizImpl implements QuestionBiz {
	private QuestionDao questionDao=new QuestionDaoImpl();
	public List<QuestionInfo> selectQuestion() {
		// TODO Auto-generated method stub
		return questionDao.selectQuestion();
	}

}
