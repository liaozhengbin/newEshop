package cn.yunhe.eshop.biz;

import java.util.List;

import cn.yunhe.eshop.entity.TypeInfo;

public interface TypeBiz {
	
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
