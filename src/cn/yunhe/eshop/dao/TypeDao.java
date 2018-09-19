package cn.yunhe.eshop.dao;

import java.util.List;

import cn.yunhe.eshop.entity.TypeInfo;



public interface TypeDao {
	/**
	 * 查询一级分类列表
	 * @return
	 */
	List<TypeInfo> selectType();
	
	/**
	 * 查询二级分类列表
	 * @return
	 */
	List<TypeInfo> selectListByParentId(int typeId);
	
}
