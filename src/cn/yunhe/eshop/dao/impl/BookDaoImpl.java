package cn.yunhe.eshop.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.yunhe.eshop.dao.BookDao;
import cn.yunhe.eshop.entity.BookInfo;
import cn.yunhe.eshop.util.ORMUtil;
import cn.yunhe.eshop.util.UtilityClass4;

public class BookDaoImpl implements BookDao {

	public List<BookInfo> selectBook() {
		// TODO Auto-generated method stub
		String sql="SELECT book_name,DATE_FORMAT(book_date,'%m-%d') book_date FROM tb_book LIMIT 7";
		List<BookInfo> bookList=ORMUtil.ormutil().selectList(sql, null, BookInfo.class);
		return bookList;
	}

	public List<BookInfo> selectBookList(Map<String, Object> map) {
		String typeId=(String) map.get("typeId");
		String childTypeId=(String) map.get("childTypeId");
		String keyword=(String) map.get("keyword");
		int page=(Integer) map.get("page");
		int line=(Integer) map.get("line");
		System.out.println("typeId is "+typeId);
		System.out.println("childTypeId is "+childTypeId);
		System.out.println("keyword is "+keyword);
		
		List<Object> paramList=new ArrayList<Object>();
		String sql="SELECT book_id,book_name,book_logo_small,book_price FROM tb_book WHERE 1=1 ";
		
		
		if (childTypeId==null || childTypeId.isEmpty() ) {//查一级分类
			if (typeId!=null && !typeId.isEmpty() ) {
				sql+=" AND type_id=? OR type_id IN (SELECT type_id FROM tb_type WHERE parent_id=?)";
				paramList.add(typeId);
				paramList.add(typeId);
			}
		}else{//查二级分类
			sql+=" AND type_id=?";
			paramList.add(childTypeId);
		}
		
		
		if (keyword!=null && !keyword.isEmpty() ) {//模糊查询内容
			sql+=" AND (book_name LIKE ? OR book_author LIKE ? OR book_press LIKE ?)";
			paramList.add("%"+keyword+"%");
			paramList.add("%"+keyword+"%");
			paramList.add("%"+keyword+"%");
		}
		
		
		
		//增加分页的参数
		//分页
		sql+=" LIMIT ?,?";
		paramList.add((page-1)*line);
		paramList.add(line);
		
		
		
		List<BookInfo> list=ORMUtil.ormutil().selectList(sql, paramList.toArray(), BookInfo.class);
		
		return list;
	}

	public BookInfo selectBookInfo(int bookId) {
		String sql="SELECT * FROM tb_book WHERE book_id=?";
		Object[] params={bookId};
		List<BookInfo> list=ORMUtil.ormutil().selectList(sql, params, BookInfo.class);
		
		return list.size()>0?list.get(0):null;
	}

	public List<String> selectBookPicList(int bookId) {
		List<String> picList=new ArrayList<String>();
		
		String sql="SELECT pic_name FROM tb_book_pic WHERE book_id=?";
		Object[] params={bookId};
		
		UtilityClass4 db=new UtilityClass4();
		List<Map<String, Object>> list=db.performDQL(sql, params);
		for (Map<String, Object> map : list) {
			picList.add((String)map.get("pic_name"));
		}
		
		return picList;
	}

	public List<BookInfo> selectBookHistory(int user_id) {
		String sql="SELECT t1.book_id,t1.book_name,t1.book_logo_small,t1.book_price,t1.book_author,t1.book_press FROM tb_book t1,tb_user_book t2 WHERE t1.book_id=t2.book_id AND t2.user_id=?";
		List<BookInfo> bookList=ORMUtil.ormutil().selectList(sql, new Object[]{user_id}, BookInfo.class);
		return bookList;
	}

	public int selectBookNum(Map<String, Object> map) {
		// TODO Auto-generated method stub
		String typeId=(String) map.get("typeId");
		String childTypeId=(String) map.get("childTypeId");
		String keyword=(String) map.get("keyword");
		
		List<Object> paramList=new ArrayList<Object>();
		String sql="SELECT COUNT(*) num FROM tb_book WHERE 1=1";
		
		
		if (childTypeId==null || childTypeId.isEmpty()) {//查一级分类
			if (typeId!=null && !typeId.isEmpty()) {
				sql+=" AND type_id=? OR type_id IN (SELECT type_id FROM tb_type WHERE parent_id=?)";
				paramList.add(typeId);
				paramList.add(typeId);
			}
		}else{//查二级分类
			sql+=" AND type_id=?";
			paramList.add(childTypeId);
		}
		
		
		if (keyword!=null && !keyword.isEmpty()) {//模糊查询内容
			sql+=" AND (book_name LIKE ? OR book_author LIKE ? OR book_press LIKE ?)";
			paramList.add("%"+keyword+"%");
			paramList.add("%"+keyword+"%");
			paramList.add("%"+keyword+"%");
		}

		List<Map<String, Object>> list=new UtilityClass4().performDQL(sql, paramList.toArray());
		Long num=(Long) list.get(0).get("num");
		return num.intValue();
	}
	
	

}
