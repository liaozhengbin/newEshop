package cn.yunhe.eshop.entity;

public class UserBookInfo {
	private int book_id;
	private int user_id;
	
	
	
	public UserBookInfo(){}
	public UserBookInfo(int book_id, int user_id) {
		super();
		this.book_id = book_id;
		this.user_id = user_id;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	
	
	
	
	
}
