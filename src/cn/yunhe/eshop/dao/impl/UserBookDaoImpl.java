package cn.yunhe.eshop.dao.impl;

import java.util.List;

import cn.yunhe.eshop.dao.UserBookDao;
import cn.yunhe.eshop.entity.UserBookInfo;
import cn.yunhe.eshop.util.ORMUtil;

public class UserBookDaoImpl implements UserBookDao {

	public void addUserBook(int user_id, int book_id) {
		String sql="INSERT INTO tb_user_book VALUES(?,?)";
		ORMUtil.ormutil().performDML(sql, new Object[]{book_id,user_id});
	}

	public UserBookInfo selectUserBook(int user_id,int book_id) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM tb_user_book WHERE user_id=? AND book_id=?;";
		List<UserBookInfo> userBookList=ORMUtil.ormutil().selectList(sql,new Object[]{user_id,book_id},UserBookInfo.class);
		return userBookList.size()>0?userBookList.get(0):null;
	}

	public void updateUserBook(int user_id,int book_id) {
		// TODO Auto-generated method stub
		String sql="DELETE FROM tb_user_book WHERE user_id=? AND book_id=?;";
		ORMUtil.ormutil().performDML(sql, new Object[]{user_id,book_id});
	}

}
