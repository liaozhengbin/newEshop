package cn.yunhe.eshop.biz.impl;

import java.util.List;

import cn.yunhe.eshop.biz.ProvincesBiz;
import cn.yunhe.eshop.dao.ProvincesDao;
import cn.yunhe.eshop.dao.impl.ProvincesDaoImpl;
import cn.yunhe.eshop.entity.ProvincesInfo;

public class ProvincesBizImpl implements ProvincesBiz {
	private ProvincesDao provincesDao=new ProvincesDaoImpl();

	public List<ProvincesInfo> selectProvinces() {
		// TODO Auto-generated method stub
		return provincesDao.selectProvinces();
	}

	public List<ProvincesInfo> selectCity(String id) {
		// TODO Auto-generated method stub
		return provincesDao.selectCity(id);
	}

	public List<ProvincesInfo> selectArea(String id) {
		// TODO Auto-generated method stub
		return provincesDao.selectArea(id);
	}

}
