package com.dabao.oa.bean;

import java.util.Date;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 缺勤记录Bean
 * 
 * @author dabao
 *
 */
@Data
@Component
public class AbsenteeRecord {
	private Long absentee_id; // 缺勤记录id
	private Long t_u_user; // 记录缺勤人id
	private Long buildingId;// 楼宇id

	private Long dorId;// 宿舍id
	private Date absentee_date; // 日期
	private String absentee_desc;// 备注

	private User user; // 缺勤人

}
