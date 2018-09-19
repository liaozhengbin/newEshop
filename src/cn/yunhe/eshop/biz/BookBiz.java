package cn.yunhe.eshop.biz;

import java.util.List;

import cn.yunhe.eshop.entity.BookInfo;

public interface BookBiz {
	//查看书
	List<BookInfo> selectBook();
	
	/**
	 * 查询书籍列表（通过大分类ID查询）
	 * @param typeId
	 * @return
	 */
	List<BookInfo> selectBookList(String typeId,String childTypeId,String keyword, int page,int line);
	
	
	/**
	 * 查询书籍总数列表
	 * @param typeId
	 * @return
	 */
	int selectBookNum(String typeId,String childTypeId,String keyword);
	
	
	/**
	 * 查询书籍列表总页数
	 * @param typeId
	 * @return
	 */
	int selectBookIndex(String typeId,String childTypeId,String keyword,int line);
	
	
	/**
	 * 查询书籍详情信息
	 * @param bookId
	 * @return
	 */
	BookInfo selectBookInfo(int bookId);
	
	
	/**
	 * 查询书籍子图列表
	 * @param bookId
	 * @return
	 */
	List<String> selectBookPicList(int bookId);
	
	
	/**
	 * 查看历史记录
	 * @return
	 */
	List<BookInfo> selectBookHistory(int user_id);
	
}
