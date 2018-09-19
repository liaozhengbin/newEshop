package cn.yunhe.eshop.dao;

import java.util.List;
import java.util.Map;

import cn.yunhe.eshop.entity.BookInfo;

public interface BookDao {
	//查看书
	List<BookInfo> selectBook();
	
	
	/**
	 * 查询书籍列表（通过大分类ID查询）
	 * @param typeId
	 * @return
	 */
	List<BookInfo> selectBookList(Map<String, Object> map);
	
	
	/**
	 * 查询书籍列表总数（通过大分类ID查询）
	 * @param typeId
	 * @return
	 */
	int selectBookNum(Map<String, Object> map);
	
	
	/**
	 * 查看历史记录
	 * @return
	 */
	List<BookInfo> selectBookHistory(int user_id);
	
	
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
}
