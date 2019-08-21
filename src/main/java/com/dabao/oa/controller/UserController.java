package com.dabao.oa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dabao.oa.bean.Building;
import com.dabao.oa.bean.Dormitory;
import com.dabao.oa.bean.Page;
import com.dabao.oa.bean.User;
import com.dabao.oa.service.BuildingService;
import com.dabao.oa.service.DormitoryService;
import com.dabao.oa.service.impl.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	private User user;

	@Autowired
	private UserServiceImpl userServiceImpl;
	@Autowired
	private BuildingService build;

	// @Autowired
	// private BuildingService buildingServiceImpl;
	//
	@Autowired
	private DormitoryService dormitoryServiceImpl;

	@Autowired
	HttpSession session;

	@Autowired
	HttpServletRequest request;

	/**
	 * 登录
	 * 
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "Userlogin", method = RequestMethod.POST)
	public String Userlogin(User user) throws IOException {
		System.out.println(user);
		User loginUser = userServiceImpl.login(user);
		if (loginUser != null) {// 若用户不为空则登录成功
			// 将用户存入session中
			session.setAttribute("existUser", loginUser);
			// 移除登录错误提示
			request.removeAttribute("fail");
			// 跳转首页
			return "index";

		} else {// 密码错误重新登录
			request.setAttribute("fail", "账户密码错误!");
			request.setAttribute("failUser", user);
			request.getSession().removeAttribute("existUser");
			return "login";
		}
	}

	@RequestMapping(value = "Userlogout")
	public String Userlogout() {
		session.removeAttribute("existUser");
		// 跳转首页
		return "redirect:/login.jsp";
	}

	// http://localhost:8080/StudentOA/user_findByPageUI.action?identity=1
	@RequestMapping("findByPageUI/{identity}/{pageNum}")
	public String findByPageUI(@PathVariable("identity") Integer id, @PathVariable("pageNum") Integer pageNum) {
		if (id != null) {
			Page page = userServiceImpl.findByPage(id, pageNum);
			// 把获取的学生对象放入request域
			request.setAttribute("userlist", page.getList());
			request.setAttribute("page", page);
			// 前台获取当前要操作的对象类型
			request.setAttribute("model", id);
			if (id == 1) {
				return "user/adminM";
			} else if (id == 0) {
				return "user/students";
			}

		}
		return "error";
	}

	// 修改用户
	@RequestMapping("lookUser/{userid}")
	public String lookUser(@PathVariable("userid") Integer userid) {
		User user = userServiceImpl.findById(userid);
		request.setAttribute("user", user);
		return "user/updateUser";
	}

	// 删除用户
	@RequestMapping("deleteUser/{userid}")
	public String delete(@PathVariable("userid") Integer userid) {
		userServiceImpl.delete(userid);
		String path = request.getContextPath();
		return "forward:/findByPageUI/1/1";

	}

	@RequestMapping("userin")
	public String userin(String usercode) {
		//获取所有学生
		List<User> userlist = userServiceImpl.getusers(0);
		//获取所有楼层
		List<Building> builds = build.getBuilds();
		//获取所有宿舍
		List<Dormitory> Dormitorylist = dormitoryServiceImpl.getdormitorys();
		//存储所有对象
		request.setAttribute("userlist", userlist);
		request.setAttribute("build", builds);
		request.setAttribute("Dormitorylist", Dormitorylist);
		return "user/studentin";
	}
	@RequestMapping(value="userin/stu",method=RequestMethod.POST)
	public String stu(String usercode,String buildid,String Dormitoryid) {
		//获取学生入住状态
		User user = userServiceImpl.getuserbycode(usercode);
		Integer check_in = user.getCheck_in();
		if (check_in == 0) {
			//未入住,更改该学生状态
			user.setBuilding_id(Long.parseLong(buildid));
			Dormitory dormitory = dormitoryServiceImpl.getDorById(Long.parseLong(Dormitoryid));
			user.setDormitory(dormitory);
			userServiceImpl.updateUser(user);
		}
		return "user/students";
	}
}
