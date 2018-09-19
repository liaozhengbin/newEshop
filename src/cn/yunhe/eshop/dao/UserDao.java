package cn.yunhe.eshop.dao;





import cn.yunhe.eshop.entity.UserInfo;

public interface UserDao {
	
	//验证用户名或密码
	UserInfo validationUser(String user_name,String user_pwd);
	
	
	//根据用户ID查询用户信息
	UserInfo selectUser(int userId);
	
	//添加用户
	int addUser(UserInfo user);
	
	
	//邮箱验证
	void validationUser(int userId);
	
	//邮箱验证
	boolean selectEmail(String email);
	
	//邮箱验证
	boolean selectUserName(String userName);

}
