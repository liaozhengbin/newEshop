package cn.yunhe.eshop.dao;

import java.util.List;

import cn.yunhe.eshop.entity.TypeInfo;



public interface TypeDao {
	/**
	 * ��ѯһ�������б�
	 * @return
	 */
	List<TypeInfo> selectType();
	
	/**
	 * ��ѯ���������б�
	 * @return
	 */
	List<TypeInfo> selectListByParentId(int typeId);
	
}
