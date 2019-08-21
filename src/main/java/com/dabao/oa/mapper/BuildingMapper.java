package com.dabao.oa.mapper;

import java.util.List;

import com.dabao.oa.bean.Building;
import com.dabao.oa.bean.User;
/**
 * 楼宇
 * 查询所有（Base）
 * 添加（Base）
 * 修改（Base）
 * 删除（Base）
 * 根据用户id删除楼宇的管理员id
 * 条件查询
 * @author wff
 *
 */
public interface BuildingMapper{
	//通过性别精确查找楼宇
	public List<Building> findByBuilding(String gender);
	//根据id删除楼宇管理员id
	public void deleteBuildingById(User user);
	//查询所有（Base）
	public  List<Building> getBuilds();
}

