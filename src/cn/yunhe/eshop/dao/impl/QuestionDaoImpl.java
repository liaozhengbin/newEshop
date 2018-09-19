package cn.yunhe.eshop.dao.impl;

import java.util.List;

import cn.yunhe.eshop.dao.QuestionDao;
import cn.yunhe.eshop.entity.QuestionInfo;
import cn.yunhe.eshop.util.ORMUtil;

public class QuestionDaoImpl implements QuestionDao {

	public List<QuestionInfo> selectQuestion() {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM tb_question";
		List<QuestionInfo> questionList=ORMUtil.ormutil().selectList(sql, null, QuestionInfo.class);
		return questionList;
	}

}
