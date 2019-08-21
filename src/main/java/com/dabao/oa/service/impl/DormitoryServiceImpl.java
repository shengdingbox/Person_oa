package com.dabao.oa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dabao.oa.bean.Dormitory;
import com.dabao.oa.bean.Page;
import com.dabao.oa.mapper.DormitoryMapper;
import com.dabao.oa.service.DormitoryService;
import com.dabao.oa.utils.PageUtil;

@Service
public class DormitoryServiceImpl implements DormitoryService {

	@Autowired
	DormitoryMapper dormitoryMapper;
	@Autowired 
	PageUtil<Dormitory> page;
	
	@Override
	public Page findByPage(int pageCode) {
		List<Dormitory> list = dormitoryMapper.getAllByPage();
		Page<Dormitory> page2 = page.getPage(pageCode, list);
		return page2;
	}
	
	@Override
	public void addStuDor(Long DorId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dormitory findByDorName(String dorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changeStuDor(Long user_id, Long newDorId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dormitory getDorById(Long dormitory_id) {
		Dormitory dormitory = dormitoryMapper.getDroById(dormitory_id);
		return dormitory;
	}

	@Override
	public void save(Dormitory dormitory) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Dormitory dormitory) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Dormitory> getdormitorys() {
		List<Dormitory> list = dormitoryMapper.getAllByPage();
		return list;
	}

	

}
