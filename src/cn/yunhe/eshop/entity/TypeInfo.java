package cn.yunhe.eshop.entity;

public class TypeInfo {
	private int type_id;
	private String type_name;
	
	
	
	public TypeInfo(){}
	public TypeInfo(int type_id, String type_name) {
		super();
		this.type_id = type_id;
		this.type_name = type_name;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	
	
	
	
	

}