package com.dabao.oa.bean;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 宿舍Bean
 * 
 * @author dabao
 */
@Data
@Component
public class Dormitory {
	private Long dormitory_id; // 宿舍id
	private String dor_phone; // 电话
	private Integer dor_Mnumber; // 最大人数

	private Integer dor_number; // 人数
	private String gender_in; // 入住性别
	private String dormitory_name; // 宿舍编码

	private Set<User> users = new HashSet<>(); // 所住人员
	private Building building; // 楼宇id

}
