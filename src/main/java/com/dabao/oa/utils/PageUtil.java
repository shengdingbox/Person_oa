package com.dabao.oa.utils;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dabao.oa.bean.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Component
public class PageUtil<T> {
	public Page<T> getPage(Integer pageCode, List<T> list) {
	PageHelper.startPage(pageCode, 5);
	PageInfo<T> pageInfo = new PageInfo<T>(list, 5);
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
	return new Page<T>(pages, nextPage, prePage, pagenum, list,nums);
	}
}
