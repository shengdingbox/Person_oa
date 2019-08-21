package com.dabao.oa.bean;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
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
}
