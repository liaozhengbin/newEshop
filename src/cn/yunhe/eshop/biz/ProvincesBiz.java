package cn.yunhe.eshop.biz;

import java.util.List;

import cn.yunhe.eshop.entity.ProvincesInfo;

public interface ProvincesBiz {
	
	//��ʡ
	List<ProvincesInfo> selectProvinces();
		
	//����
	List<ProvincesInfo> selectCity(String id);
			
	//����
	List<ProvincesInfo> selectArea(String id);
	

}
