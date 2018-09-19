package cn.yunhe.eshop.dao.impl;

import java.util.List;

import cn.yunhe.eshop.dao.TypeDao;
import cn.yunhe.eshop.entity.TypeInfo;
import cn.yunhe.eshop.util.ORMUtil;

public class TypeDaoImpl implements TypeDao {

	public List<TypeInfo> selectType() {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM tb_type WHERE parent_id=0 ORDER BY type_id LIMIT 13";
		List<TypeInfo> typeList=ORMUtil.ormutil().selectList(sql, null, TypeInfo.class);
		return typeList;
	}

	public List<TypeInfo> selectListByParentId(int typeId) {
		String sql="SELECT * FROM tb_type WHERE parent_id=?";
		List<TypeInfo> typeList=ORMUtil.ormutil().selectList(sql, new Object[]{typeId}, TypeInfo.class);
		return typeList;
	}

}
