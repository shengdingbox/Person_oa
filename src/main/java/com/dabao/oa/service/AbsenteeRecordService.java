package com.dabao.oa.service;


import com.dabao.oa.bean.AbsenteeRecord;

public interface AbsenteeRecordService {
	//查看学生缺勤记录
//	public PageBean<AbsenteeRecord> findByPage(AbsenteeRecord absenteeRecord,int pageCode);

	public void save(AbsenteeRecord absenteeRecord);
}
