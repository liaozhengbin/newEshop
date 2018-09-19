package cn.yunhe.eshop.dao.impl;

import java.util.List;

import cn.yunhe.eshop.dao.UserDao;
import cn.yunhe.eshop.entity.UserInfo;
import cn.yunhe.eshop.util.ORMUtil;

public class UserDaoImpl implements UserDao {

	public UserInfo validationUser(String user_name,String user_pwd) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM tb_user WHERE (user_name=? OR user_email=? ) AND user_pwd=? ";
		Object[] userArray={user_name,user_name,user_pwd};
		List<UserInfo> userList=ORMUtil.ormutil().selectList(sql, userArray, UserInfo.class);
		return userList.size()>0?userList.get(0):null;
	}

	public UserInfo selectUser(int userId) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM tb_user WHERE user_id=?  ";
		Object[] userArray={userId};
		List<UserInfo> userList=ORMUtil.ormutil().selectList(sql, userArray, UserInfo.class);
		return userList.size()>0?userList.get(0):null;
	}

	public int addUser(UserInfo user) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO tb_user (user_email,user_name,user_pwd,user_sex,user_phone,question_id,question_answer,time ) VALUES (?,?,?,?,?,?,?,now() ) ";
		Object[] userArray={user.getUser_email(),user.getUser_name(),user.getUser_pwd(),user.getUser_sex(),user.getUser_phone(),user.getQuestion_id(),user.getQuestion_answer()};
		int user_id=ORMUtil.ormutil().performDML_index(sql, userArray);
		return user_id;
	
	}

	public void validationUser(int userId) {
		// TODO Auto-generated method stub
		String sql="UPDATE tb_user SET is_activated=1 WHERE user_id=?";
		Object[] userIdArray={};
		ORMUtil.ormutil().performDML(sql, userIdArray);
	}

	public boolean selectEmail(String email) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM tb_user WHERE user_email=? ";
		Object[] userIdArray={email};
		List<UserInfo> userList=ORMUtil.ormutil().selectList(sql, userIdArray, UserInfo.class);
		return userList.size()>0;
	}

	public boolean selectUserName(String userName) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM tb_user WHERE user_name=? ";
		Object[] userIdArray={userName};
		List<UserInfo> userList=ORMUtil.ormutil().selectList(sql, userIdArray, UserInfo.class);
		return userList.size()>0;
	}

}
