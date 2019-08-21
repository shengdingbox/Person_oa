package com.dabao.oa.service;

import java.io.IOException;
import java.util.List;

import com.dabao.oa.bean.Page;
import com.dabao.oa.bean.User;

/**
 * 用户业务层
 * 
 * @author dabao
 *
 */
public interface UserService {
	// 登录
	public User login(User user) throws IOException;

	// 条件查询
	public Page findByPage(Integer id, Integer pageNum);
	
	//获取所有对象
	public List<User> getusers(Integer identity);


	// 添加用户
	public void addUser(User user);

	// 删除管理员楼宇权限
	public void deleteAndChangeAdminInfo(Long user_id, Long building_id);

	// 修改用户
	public void updateUser(User user);

	// 通过id查学生
	public User findById(Integer userid);
	
	// 通过学号查学生
	public User getuserbycode(String usercode);

	public void delete(Integer userid);

}
