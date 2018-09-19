package cn.yunhe.eshop.biz;

import cn.yunhe.eshop.entity.UserInfo;

public interface UserBiz {
	
	
	
	//验证用户名或密码
	UserInfo validationUser(String user_name,String user_pwd);
	
	//根据用户ID查询用户信息
	UserInfo selectUser(int userId);
	
	//添加用户
	int addUser(String user_email,String user_name,String user_pwd,String user_sex,String user_phone,int question_id,String question_answer);
	
	//邮箱验证
	void validationUser(int userId);
	
	//验证邮箱是否存在
	boolean selectEmail(String email);
		
	//验证用户名是否存在
	boolean selectUserName(String userName);
	
	
}
