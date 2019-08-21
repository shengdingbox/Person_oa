package com.dabao.oa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dabao.oa.bean.Page;
import com.dabao.oa.service.BuildingService;

@SpringBootConfiguration
public class Buildingcontroller {

	@Autowired
	BuildingService build;
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping("/findbuildByPageUI/{pageCode}")
	public String findbuildByPageUI(@PathVariable("pageCode")Integer pageCode ) {
		Page page = build.findByPage(pageCode);
		request.setAttribute("page", page);
		return "build/buildingList";
	}
	}
