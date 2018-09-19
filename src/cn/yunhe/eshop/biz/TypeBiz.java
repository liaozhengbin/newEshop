package cn.yunhe.eshop.biz;

import java.util.List;

import cn.yunhe.eshop.entity.TypeInfo;

public interface TypeBiz {
	
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
