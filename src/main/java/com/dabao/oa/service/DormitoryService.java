package com.dabao.oa.service;

import java.util.List;

import com.dabao.oa.bean.Dormitory;
import com.dabao.oa.bean.Page;

/**
 * 宿舍 修改宿舍信息
 * 
 * @author dabao
 */
public interface DormitoryService {
	// 条件查询
	public Page findByPage(int pageCode);

	// 修改
	// public Dormitory updateDor();
	// 添加学生到宿舍(宿舍人数+1)
	public void addStuDor(Long DorId);

	// 通过宿舍名称查找宿舍
	public Dormitory findByDorName(String dorName);

	// 宿舍调换
	public void changeStuDor(Long user_id, Long newDorId);
	
    //通过宿舍序号获取宿舍
	public Dormitory getDorById(Long dormitory_id);

	public void save(Dormitory dormitory);

	public void update(Dormitory dormitory);
	//获取所有宿舍
	public List<Dormitory> getdormitorys();
}
