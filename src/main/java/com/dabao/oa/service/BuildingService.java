package com.dabao.oa.service;

import java.util.List;

import com.dabao.oa.bean.Building;
import com.dabao.oa.bean.Page;
import com.dabao.oa.bean.User;

/**
 * 楼宇service
 * 
 * @author dabao
 *
 */
public interface BuildingService {
	// 条件查询楼宇
	public Page findByPage(int pageCode);

	// 获取楼宇信息
	public Building findBuildingInfo(Long id);

	// 清空楼宇管理员的信息
	public Building clearAdminInfo(Long building_id);

	// 添加管理员信息
	public void addAndChangeAdmingInfo(User newUser);

	public void add(Building building);

	public List<Building> findByBuilding(String gender);

	public void update(Building bud);
	//获取所有的楼宇
	public List<Building> getBuilds();
 }
