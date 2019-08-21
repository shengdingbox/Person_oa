package com.dabao.oa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dabao.oa.bean.Building;
import com.dabao.oa.bean.Page;
import com.dabao.oa.bean.User;
import com.dabao.oa.mapper.BuildingMapper;
import com.dabao.oa.service.BuildingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class BuildingServlceImpl implements BuildingService {
	
	
	@Autowired
	BuildingMapper build;
	

	@Override
	public Page<Building> findByPage(int pageCode) {
		PageHelper.startPage(pageCode, 5);
		List<Building> builds = build.getBuilds();
		PageInfo<Building> pageInfo = new PageInfo<>(builds, 5);
		//总页码
		int pages = pageInfo.getPages();
		//下一页
		int nextPage = pageInfo.getNextPage();
		//上一页
		int prePage = pageInfo.getPrePage();
		//当前页
		int pagenum = pageInfo.getPageNum();
		//所有页码
		int[] nums = pageInfo.getNavigatepageNums();
		
		return new Page<Building>(pages, nextPage, prePage, pagenum, builds,nums);
		//new Page<Building>();
		
		
	}
	@Override
	public List<Building> getBuilds() {
		List<Building> builds = build.getBuilds();
		return builds;
	}
	
	@Override
	public Building findBuildingInfo(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Building clearAdminInfo(Long building_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAndChangeAdmingInfo(User newUser) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(Building building) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Building> findByBuilding(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Building bud) {
		// TODO Auto-generated method stub

	}
	

	

}
