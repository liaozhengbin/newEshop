package cn.yunhe.eshop.dao.impl;

import java.util.List;

import cn.yunhe.eshop.dao.ProvincesDao;
import cn.yunhe.eshop.entity.ProvincesInfo;
import cn.yunhe.eshop.util.ORMUtil;

public class ProvincesDaoImpl implements ProvincesDao {

	public List<ProvincesInfo> selectProvinces() {
		// TODO Auto-generated method stub
		String sql="SELECT provinceid id,province name FROM provinces ";
		List<ProvincesInfo> provincesList=ORMUtil.ormutil().selectList(sql, null, ProvincesInfo.class);
		return provincesList;
	}

	public List<ProvincesInfo> selectCity(String id) {
		// TODO Auto-generated method stub
		String sql="SELECT cityid id,city name FROM cities WHERE provinceid=? ";
		Object[] idArray={id};
		List<ProvincesInfo> cityList=ORMUtil.ormutil().selectList(sql, idArray, ProvincesInfo.class);
		return cityList;
	}

	public List<ProvincesInfo> selectArea(String id) {
		// TODO Auto-generated method stub
		String sql="SELECT areaid id,area name FROM areas WHERE cityid=? ";
		Object[] idArray={id};
		List<ProvincesInfo> areaList=ORMUtil.ormutil().selectList(sql, idArray, ProvincesInfo.class);
		return areaList;
	}

}
