package cn.yunhe.eshop.entity;

public class BookInfo {
	
	private int book_id;					//�鼮ID
	private String book_name;				//�鼮����
	private String book_logo_small;		 	//�鼮logo(С)
	private String book_logo_big;		 	//�鼮logo(��)
	private double book_price;				//�ּ�
	private double book_price_old;			//ԭ��
	private String book_author;				//����
	private String book_description;		//��Ʒ���飨��������д�����html���룩
	private String book_press;				//������
	private int type_id;					//����id
	private int store_count;				//�����		
	private String book_date;				//����鼮����
	private int num;//���ﳵ����Ҫ������
	
	
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
