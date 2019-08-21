package com.dabao.oa.mapper;

import java.util.List;

import com.dabao.oa.bean.User;
/**
 * 登录
 * 查询所有(base)
 * 添加(base)
 * 删除楼宇管理员
 * 条件查询
 * 查看学生缺勤记录
 * @author wff
 *
 */
public interface UserMapper{
	//登录
	public User login(User user);
	//通过权限找用户
	public List<User> getUsers(Integer superid);
	//通过用户id找用户
	public User getUser(Integer userid);
	//通过学号找用户
	public User getUserbycode(String usercode);
	//通过用户id删除用户
	public void deleteUser(Integer userid);
	//通过用户id删除用户
	public void updateUser(User user);
}
