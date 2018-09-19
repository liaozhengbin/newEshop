package cn.yunhe.eshop.biz.impl;

import java.util.List;

import cn.yunhe.eshop.biz.TypeBiz;
import cn.yunhe.eshop.dao.TypeDao;
import cn.yunhe.eshop.dao.impl.TypeDaoImpl;
import cn.yunhe.eshop.entity.TypeInfo;

public class TypeBizImpl implements TypeBiz {
	private TypeDao typeDao=new TypeDaoImpl();

	public List<TypeInfo> selectType() {
		// TODO Auto-generated method stub
		return typeDao.selectType();
	}

	public List<TypeInfo> selectListByParentId(int typeId) {
		// TODO Auto-generated method stub
		return typeDao.selectListByParentId(typeId);
	}

}
