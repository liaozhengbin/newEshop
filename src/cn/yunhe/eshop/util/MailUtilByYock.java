package cn.yunhe.eshop.util;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;

public class MailUtilByYock {
	
	// ������SMTP���ͷ�������Э��
	public static final String HOST_NAME = "smtp.126.com";
	// ��½�ʼ����������û��������롢�ǳ�
	public static final String USERNAME = "yunhejava@126.com";
	public static final String PASSWORD = "aaaaa123456";//lanqiao123
	public static final String NICKNAME = "EShop�̳�";

	
	/**
	 * �����ʼ����ɹ�true��ʧ��false��
	 * @param receiveEmail	�ռ�������
	 * @param receiveNick	�ռ����ǳƣ����ȡ��
	 * @param subject		�ʼ�����
	 * @param contents		�ʼ�����
	 * @return
	 */
	public static final boolean sendMail(String receiveEmail,String receiveNick,String subject,String contents){
		HtmlEmail email = new HtmlEmail ();
		try {
			//smtp host 
			email.setHostName(HOST_NAME);
			//��½�ʼ����������û���������
			email.setAuthentication(USERNAME,PASSWORD);
			//������
			email.addTo(receiveEmail, receiveNick);
			//������
			email.setFrom(USERNAME, NICKNAME);
			//����
			email.setSubject(subject);
			//�ʼ�����
			email.setCharset("utf-8");
			email.setHtmlMsg(contents);
			//����
			email.send();
			return true;
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
//		MultiPartEmail email = new MultiPartEmail();
//		try {
//			//smtp host 
//			email.setHostName(HOST_NAME);
//			//��½�ʼ����������û���������
//			email.setAuthentication(USERNAME,PASSWORD);
//			//������
//			email.addTo(receiveEmail, receiveNick);
//			//������
//			email.setFrom(USERNAME, NICKNAME);
//			//����
//			email.setSubject(subject);
//			//�ʼ�����
//			email.setMsg(contents);
//			//����
//			email.send();
//			return true;
//			
//		} catch (EmailException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return false;
//		}
		
	}
	
	
	public static void main(String[] args) {
		
		String msg="<h1>�ʼ�����</h1>";
		
		boolean result=sendMail("624098050@qq.com", "yike", "�����EShop�û�ע�ᣨ���ԣ�", "�˴�ʡ��һǧ��....");
		System.out.println(result);
	}
	
	
}
