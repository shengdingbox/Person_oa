package com.dabao.oa.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 楼宇Bean
 * 
 * @author dabao
 *
 */
@Data
@Component
public class Building implements Serializable{
	/**
	 * @author Daobao
	 */
	private static final long serialVersionUID = 5835883717628856856L;

	private Long buildingid; // 楼宇id
	private String bdesc; // 楼宇介绍
	private String genderin; // 可入住性别

	private Long userid; // 管理员id
	private Set<Dormitory> dormitorys = new HashSet<Dormitory>();// 宿舍

}
