package cn.yunhe.eshop.biz;

import cn.yunhe.eshop.entity.UserInfo;

public interface UserBiz {
	
	
	
	//��֤�û���������
	UserInfo validationUser(String user_name,String user_pwd);
	
	//�����û�ID��ѯ�û���Ϣ
	UserInfo selectUser(int userId);
	
	//����û�
	int addUser(String user_email,String user_name,String user_pwd,String user_sex,String user_phone,int question_id,String question_answer);
	
	//������֤
	void validationUser(int userId);
	
	//��֤�����Ƿ����
	boolean selectEmail(String email);
		
	//��֤�û����Ƿ����
	boolean selectUserName(String userName);
	
	
}
