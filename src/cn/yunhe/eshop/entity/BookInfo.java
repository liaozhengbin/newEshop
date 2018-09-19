package cn.yunhe.eshop.entity;

public class BookInfo {
	
	private int book_id;					//书籍ID
	private String book_name;				//书籍名称
	private String book_logo_small;		 	//书籍logo(小)
	private String book_logo_big;		 	//书籍logo(大)
	private double book_price;				//现价
	private double book_price_old;			//原价
	private String book_author;				//作者
	private String book_description;		//商品详情（这个里面有大量的html代码）
	private String book_press;				//出版社
	private int type_id;					//类型id
	private int store_count;				//库存数		
	private String book_date;				//添加书籍日期
	private int num;//购物车中需要的数量
	
	
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public double getBook_price() {
		return book_price;
	}
	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}
	public double getBook_price_old() {
		return book_price_old;
	}
	public void setBook_price_old(double book_price_old) {
		this.book_price_old = book_price_old;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getBook_description() {
		return book_description;
	}
	public void setBook_description(String book_description) {
		this.book_description = book_description;
	}
	public String getBook_press() {
		return book_press;
	}
	public void setBook_press(String book_press) {
		this.book_press = book_press;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public String getBook_logo_small() {
		return book_logo_small;
	}
	public void setBook_logo_small(String book_logo_small) {
		this.book_logo_small = book_logo_small;
	}
	public String getBook_logo_big() {
		return book_logo_big;
	}
	public void setBook_logo_big(String book_logo_big) {
		this.book_logo_big = book_logo_big;
	}
	public int getStore_count() {
		return store_count;
	}
	public void setStore_count(int store_count) {
		this.store_count = store_count;
	}
	public String getBook_date() {
		return book_date;
	}
	public void setBook_date(String book_date) {
		this.book_date = book_date;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	
	
	
	
}
