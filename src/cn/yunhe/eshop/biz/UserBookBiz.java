package cn.yunhe.eshop.biz;

import cn.yunhe.eshop.entity.UserBookInfo;

public interface UserBookBiz {
	
	
	/**
	 * ����û��������¼
	 * @param user_id
	 * @param book_id
	 */
	 
	void addUserBook(int user_id,int book_id);
	
	
	/**
	 * ��ѯ�Ƿ����ͬ������Ʒ
	 * @param user_id
	 * @param book_id
	 */
	UserBookInfo selectUserBook(int user_id,int book_id);
	
	
	/**
	 * ɾ�������ʷ��Ʒ
	 * @param user_id
	 * @param book_id
	 */
	void updateUserBook(int user_id,int book_id);
	
	
}
