package cn.yunhe.eshop.biz.impl;

import cn.yunhe.eshop.biz.UserBiz;
import cn.yunhe.eshop.dao.UserDao;
import cn.yunhe.eshop.dao.impl.UserDaoImpl;
import cn.yunhe.eshop.entity.UserInfo;

public class UserBizImpl implements UserBiz {
	private UserDao userDao=new UserDaoImpl();

	public UserInfo validationUser(String user_name, String user_pwd) {
		// TODO Auto-generated method stub
		return userDao.validationUser(user_name, user_pwd);
	}

	public UserInfo selectUser(int userId) {
		// TODO Auto-generated method stub
		return userDao.selectUser(userId);
	}

	public int addUser(String user_email, String user_name, String user_pwd,
			String user_sex, String user_phone, int question_id,
			String question_answer) {
		UserInfo user=new UserInfo();
		user.setUser_email(user_email);
		user.setUser_name(user_name);
		user.setUser_pwd(user_pwd);
		user.setUser_sex(user_sex);
		user.setUser_phone(user_phone);
		user.setQuestion_id(question_id);
		user.setQuestion_answer(question_answer);
		return userDao.addUser(user);
		// TODO Auto-generated method stub
		
	}

	public void validationUser(int userId) {
		// TODO Auto-generated method stub
		userDao.validationUser(userId);
	}

	public boolean selectEmail(String email) {
		// TODO Auto-generated method stub
		return userDao.selectEmail(email);
	}

	public boolean selectUserName(String userName) {
		// TODO Auto-generated method stub
		return userDao.selectUserName(userName);
	}

}
