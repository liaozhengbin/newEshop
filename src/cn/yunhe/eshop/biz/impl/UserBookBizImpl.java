package cn.yunhe.eshop.biz.impl;

import cn.yunhe.eshop.biz.UserBookBiz;
import cn.yunhe.eshop.dao.UserBookDao;
import cn.yunhe.eshop.dao.impl.UserBookDaoImpl;
import cn.yunhe.eshop.entity.UserBookInfo;

public class UserBookBizImpl implements UserBookBiz {
	private UserBookDao userBookDao=new UserBookDaoImpl();
	public void addUserBook(int user_id, int book_id) {
		// TODO Auto-generated method stub
		userBookDao.addUserBook(user_id, book_id);
	}
	public UserBookInfo selectUserBook(int user_id, int book_id) {
		// TODO Auto-generated method stub
		return userBookDao.selectUserBook(user_id, book_id);
	}
	public void updateUserBook(int user_id, int book_id) {
		// TODO Auto-generated method stub
		userBookDao.selectUserBook(user_id, book_id);
	}
	
	
	

}
