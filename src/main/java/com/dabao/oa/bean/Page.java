package com.dabao.oa.bean;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Page<E> {
	//总页码
	Integer pages;
	//下一页
	Integer nextPage;
	//上一页
	Integer prePage;
	//当前页
	Integer pagenum;
	//查出来的数据
	List<E> list;
	//显示的页码
	int[] nums;
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public Integer getNextPage() {
		return nextPage;
	}
	public void setNextPage(Integer nextPage) {
		this.nextPage = nextPage;
	}
	public Integer getPrePage() {
		return prePage;
	}
	public void setPrePage(Integer prePage) {
		this.prePage = prePage;
	}
	public Integer getPagenum() {
		return pagenum;
	}
	public void setPagenum(Integer pagenum) {
		this.pagenum = pagenum;
	}
	
	public List<E> getList() {
		return list;
	}
	public void setList(List<E> list) {
		this.list = list;
	}
	
	public int[] getNums() {
		return nums;
	}
	public void setNums(int[] nums) {
		this.nums = nums;
	}

	public Page(Integer pages, Integer nextPage, Integer prePage, Integer pagenum, List<E> list, int[] nums) {
		super();
		this.pages = pages;
		this.nextPage = nextPage;
		this.prePage = prePage;
		this.pagenum = pagenum;
		this.list = list;
		this.nums = nums;
	}
	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Page [pages=" + pages + ", nextPage=" + nextPage + ", prePage=" + prePage + ", pagenum=" + pagenum
				+ ", list=" + list + ", nums=" + Arrays.toString(nums) + "]";
	}
	
}
