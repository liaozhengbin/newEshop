package cn.yunhe.eshop.entity;

public class UserInfo {
	
	private int user_id;
	private String user_name;		//帐号
	private String user_pwd;		//密码	
	private String user_email;		//邮箱
	private String user_sex;		//性别
	private String user_phone;		//电话
	private String user_address;	//地址
	private String user_head;		//头像
	private int question_id;			//密保问题ID
	private String question_answer;		//密保问题答案
	private int is_activated;			//激活状态（1/0）
	private int is_online;				//是否在线
	private String province_id;
	private String city_id;
	private String area_id;
	
	
	public UserInfo(){}
	public UserInfo(int user_id, String user_name, String user_pwd,
			String user_email, String user_sex, String user_phone,
			String user_address, int question_id, String question_answer,
			int is_activated) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_pwd = user_pwd;
		this.user_email = user_email;
		this.user_sex = user_sex;
		this.user_phone = user_phone;
		this.user_address = user_address;
		this.question_id = question_id;
		this.question_answer = question_answer;
		this.is_activated = is_activated;
	}
	public UserInfo(String user_name, String user_pwd, String user_email,
			String user_sex, String user_phone, String user_address,
			int question_id, String question_answer) {
		super();
		this.user_name = user_name;
		this.user_pwd = user_pwd;
		this.user_email = user_email;
		this.user_sex = user_sex;
		this.user_phone = user_phone;
		this.user_address = user_address;
		this.question_id = question_id;
		this.question_answer = question_answer;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestion_answer() {
		return question_answer;
	}
	public void setQuestion_answer(String question_answer) {
		this.question_answer = question_answer;
	}
	public int getIs_activated() {
		return is_activated;
	}
	public void setIs_activated(int is_activated) {
		this.is_activated = is_activated;
	}
	public int getIs_online() {
		return is_online;
	}
	public void setIs_online(int is_online) {
		this.is_online = is_online;
	}
	public String getUser_head() {
		return user_head;
	}
	public void setUser_head(String user_head) {
		this.user_head = user_head;
	}
	public String getProvince_id() {
		return province_id;
	}
	public void setProvince_id(String province_id) {
		this.province_id = province_id;
	}
	public String getCity_id() {
		return city_id;
	}
	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}
	public String getArea_id() {
		return area_id;
	}
	public void setArea_id(String area_id) {
		this.area_id = area_id;
	}
	
}
