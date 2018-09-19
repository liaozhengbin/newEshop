package cn.yunhe.eshop.test.util;

import java.sql.SQLException;

import org.junit.Test;

import cn.yunhe.eshop.util.UtilityClass4;

public class NewTest {
	
	
	@Test
	public void test1(){
		
		long startMills=System.currentTimeMillis();
		
		UtilityClass4 util=new UtilityClass4();
		for (int i = 0; i < 1000; i++) {
				try {
					util.start();
					util.release();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		long endMills=System.currentTimeMillis();
		System.out.println("ÏûºÄÊ±¼ä£º"+(endMills-startMills));
	}
}
