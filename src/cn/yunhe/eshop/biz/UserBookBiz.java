package cn.yunhe.eshop.biz;

import cn.yunhe.eshop.entity.UserBookInfo;

public interface UserBookBiz {
	
	
	/**
	 * 添加用户的浏览记录
	 * @param user_id
	 * @param book_id
	 */
	 
	void addUserBook(int user_id,int book_id);
	
	
	/**
	 * 查询是否浏览同样的商品
	 * @param user_id
	 * @param book_id
	 */
	UserBookInfo selectUserBook(int user_id,int book_id);
	
	
	/**
	 * 删除浏览历史商品
	 * @param user_id
	 * @param book_id
	 */
	void updateUserBook(int user_id,int book_id);
	
	
}
