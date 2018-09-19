package cn.yunhe.eshop.dao;

import java.util.List;
import java.util.Map;

import cn.yunhe.eshop.entity.BookInfo;

public interface BookDao {
	//�鿴��
	List<BookInfo> selectBook();
	
	
	/**
	 * ��ѯ�鼮�б�ͨ�������ID��ѯ��
	 * @param typeId
	 * @return
	 */
	List<BookInfo> selectBookList(Map<String, Object> map);
	
	
	/**
	 * ��ѯ�鼮�б�������ͨ�������ID��ѯ��
	 * @param typeId
	 * @return
	 */
	int selectBookNum(Map<String, Object> map);
	
	
	/**
	 * �鿴��ʷ��¼
	 * @return
	 */
	List<BookInfo> selectBookHistory(int user_id);
	
	
	/**
	 * ��ѯ�鼮������Ϣ
	 * @param bookId
	 * @return
	 */
	BookInfo selectBookInfo(int bookId);
	
	
	/**
	 * ��ѯ�鼮��ͼ�б�
	 * @param bookId
	 * @return
	 */
	List<String> selectBookPicList(int bookId);
}
