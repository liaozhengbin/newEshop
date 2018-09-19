package cn.yunhe.eshop.entity;

public class QuestionInfo {
	private int question_id;
	private String question_title;
	public QuestionInfo(){}
	public QuestionInfo(int question_id, String question_title) {
		super();
		this.question_id = question_id;
		this.question_title = question_title;
	}
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestion_title() {
		return question_title;
	}
	public void setQuestion_title(String question_title) {
		this.question_title = question_title;
	}
	

}
