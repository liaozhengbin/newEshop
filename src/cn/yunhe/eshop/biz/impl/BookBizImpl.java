package cn.yunhe.eshop.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.yunhe.eshop.biz.BookBiz;
import cn.yunhe.eshop.dao.BookDao;
import cn.yunhe.eshop.dao.impl.BookDaoImpl;
import cn.yunhe.eshop.entity.BookInfo;

public class BookBizImpl implements BookBiz {
	private BookDao bookDao=new BookDaoImpl();

	public List<BookInfo> selectBook() {
		// TODO Auto-generated method stub
		
		return bookDao.selectBook();
	}

	public List<BookInfo> selectBookList(String typeId,String childTypeId,String keyword , int page,int line) {
		// TODO Auto-generated method stub
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("typeId", typeId);
		map.put("childTypeId", childTypeId);
		map.put("keyword", keyword);
		map.put("page", page);
		map.put("line", line);
		return bookDao.selectBookList(map);
	}

	public BookInfo selectBookInfo(int bookId) {
		// TODO Auto-generated method stub
		return bookDao.selectBookInfo(bookId);
	}

	public List<String> selectBookPicList(int bookId) {
		// TODO Auto-generated method stub
		return bookDao.selectBookPicList(bookId);
	}

	public List<BookInfo> selectBookHistory(int user_id) {
		// TODO Auto-generated method stub
		return bookDao.selectBookHistory(user_id);
	}

	public int selectBookNum(String typeId, String childTypeId, String keyword) {
		// TODO Auto-generated method stub
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("typeId", typeId);
		map.put("childTypeId", childTypeId);
		map.put("keyword", keyword);
		return bookDao.selectBookNum(map);
	}

	public int selectBookIndex(String typeId, String childTypeId,
			String keyword, int line) {
		// TODO Auto-generated method stub
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("typeId", typeId);
		map.put("childTypeId", childTypeId);
		map.put("keyword", keyword);
		int conn=bookDao.selectBookNum(map);
		return conn%line==0?conn/line:conn/line+1;
	}

}
