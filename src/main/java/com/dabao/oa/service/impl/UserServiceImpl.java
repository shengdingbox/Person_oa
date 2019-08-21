package com.dabao.oa.service.impl;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dabao.oa.bean.Page;
import com.dabao.oa.bean.User;
import com.dabao.oa.mapper.UserMapper;
import com.dabao.oa.service.UserService;
import com.dabao.oa.utils.PageUtil;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper userMapper;
	@Autowired
	HttpSession session;
	@Autowired
	Page page;
	@Autowired
	PageUtil<User> pageutil;
	
	@Override
	public User login(User user) throws IOException {
		User thisuser = userMapper.login(user);
		return thisuser;
	}
	
	@Override
	public List<User> getusers(Integer identity) {
		List<User> users = userMapper.getUsers(identity);
		return users;
	}
	@Override
	public Page findByPage(Integer id, Integer pageNum) {
		List<User> list = userMapper.getUsers(id);
		Page<User> page2 = pageutil.getPage(pageNum, list);
		return page2;
		 
	}

	@Override
	public void addUser(User user) {
		
	}

	@Override
	public void deleteAndChangeAdminInfo(Long user_id, Long building_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

	@Override
	public User findById(Integer userid) {
      User user = userMapper.getUser(userid);		
      return user;
	}

	@Override
	public void delete(Integer userid) {
		userMapper.deleteUser(userid);
		
	}

	@Override
	public User getuserbycode(String usercode) {
		User userbycode = userMapper.getUserbycode(usercode);
		return userbycode;
	}

	

}
