package cn.yunhe.eshop.biz;

import java.util.List;

import cn.yunhe.eshop.entity.ProvincesInfo;

public interface ProvincesBiz {
	
	//查省
	List<ProvincesInfo> selectProvinces();
		
	//查市
	List<ProvincesInfo> selectCity(String id);
			
	//查区
	List<ProvincesInfo> selectArea(String id);
	

}
