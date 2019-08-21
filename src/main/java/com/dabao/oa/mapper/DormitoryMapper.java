package com.dabao.oa.mapper;

import java.util.List;

import com.dabao.oa.bean.Dormitory;
/**
 * 宿舍
 * 查询所有(Base)
 * 添加（Base）
 * 修改（Base）
 * 删除（Base）
 * 条件查询
 * @author dabao
 *
 */
public interface DormitoryMapper{

	Dormitory findByDorName(String dorName);
	/**
	 * 通过分页查询所有宿舍
	 */
	List<Dormitory> getAllByPage();
	/**
	 * 通过分页查询所有宿舍
	 */
	Dormitory getDroById(Long dormitory_id);
}
