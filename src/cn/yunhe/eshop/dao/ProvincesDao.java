package cn.yunhe.eshop.dao;

import java.util.List;

import cn.yunhe.eshop.entity.ProvincesInfo;

public interface ProvincesDao {
	
	//��ʡ
	List<ProvincesInfo> selectProvinces();
	
	//����
	List<ProvincesInfo> selectCity(String id);
		
	//����
	List<ProvincesInfo> selectArea(String id);
	

}
