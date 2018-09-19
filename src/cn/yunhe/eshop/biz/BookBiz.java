package cn.yunhe.eshop.biz;

import java.util.List;

import cn.yunhe.eshop.entity.BookInfo;

public interface BookBiz {
	//�鿴��
	List<BookInfo> selectBook();
	
	/**
	 * ��ѯ�鼮�б�ͨ�������ID��ѯ��
	 * @param typeId
	 * @return
	 */
	List<BookInfo> selectBookList(String typeId,String childTypeId,String keyword, int page,int line);
	
	
	/**
	 * ��ѯ�鼮�����б�
	 * @param typeId
	 * @return
	 */
	int selectBookNum(String typeId,String childTypeId,String keyword);
	
	
	/**
	 * ��ѯ�鼮�б���ҳ��
	 * @param typeId
	 * @return
	 */
	int selectBookIndex(String typeId,String childTypeId,String keyword,int line);
	
	
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
	
	
	/**
	 * �鿴��ʷ��¼
	 * @return
	 */
	List<BookInfo> selectBookHistory(int user_id);
	
}
