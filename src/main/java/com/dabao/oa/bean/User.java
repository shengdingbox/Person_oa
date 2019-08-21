package com.dabao.oa.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 用户Bean
 * 
 * @author dabao
 *
 */
@Data
@Component
public class User implements Serializable{
	/**
	 * @author Daobao
	 */
	private static final long serialVersionUID = 8063080931631039721L;
	private Integer userid; // 用户id
	private String username; // 姓名
	private String usercode; // 账号、用户名、学号

	private String password; // 密码
	private String gender; // 姓名
	private String phone; // 电话

	private Integer identity; // 身份
	private Integer check_in; // 入住
	private Integer state; // 1能登录 0不能登录

	private Long building_id; // 楼宇id
	private Dormitory dormitory; // 宿舍id
	private Set<AbsenteeRecord> absenteeRecords = new HashSet<>();// 缺勤记录

}
