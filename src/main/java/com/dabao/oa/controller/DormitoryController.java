package com.dabao.oa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dabao.oa.bean.Page;
import com.dabao.oa.service.impl.DormitoryServiceImpl;

@Controller
public class DormitoryController{

	@Autowired 
	DormitoryServiceImpl dormitory;
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping("finddormitoryByPageUI/{pageCode}")
	public String getDormitoryByPage(@PathVariable("pageCode")Integer pageCode) {
		Page page = dormitory.findByPage(pageCode);
		request.setAttribute("page", page);
		return "dormitory/dormitoryList";
		
	}
}
