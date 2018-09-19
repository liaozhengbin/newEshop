package cn.yunhe.eshop.dao;





import cn.yunhe.eshop.entity.UserInfo;

public interface UserDao {
	
	//��֤�û���������
	UserInfo validationUser(String user_name,String user_pwd);
	
	
	//�����û�ID��ѯ�û���Ϣ
	UserInfo selectUser(int userId);
	
	//����û�
	int addUser(UserInfo user);
	
	
	//������֤
	void validationUser(int userId);
	
	//������֤
	boolean selectEmail(String email);
	
	//������֤
	boolean selectUserName(String userName);

}
