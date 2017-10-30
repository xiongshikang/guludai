package com.guludai.ui.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.guludai.ui.entity.BaseSecurityUser;
 
@Controller
@RequestMapping("")
public class HomeController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, BaseSecurityUser user) {
		if (StringUtils.isEmpty(user.getUserName()) || StringUtils.isEmpty(user.getPassword())) {
			request.setAttribute("msg", "用户名或密码不能为空！");
			return "login";
		}
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(), user.getPassword());
		try {
			subject.login(token);
			return "redirect:index";
		} catch (LockedAccountException lae) {
			token.clear();
			request.setAttribute("msg", "用户已经被锁定不能登录，请与管理员联系！");
			return "login";
		} catch (AuthenticationException e) {
			token.clear();
			request.setAttribute("msg", "用户或密码不正确！");
			return "login";
		}
	}
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	/*@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}*/
	@RequestMapping(value = "about", method = RequestMethod.GET)
	public String about() {
		return "about";
	}
	@RequestMapping(value = "user", method = RequestMethod.GET)
	public String user() {
		return "user/list";
	}
	@RequestMapping(value = "user/edit", method = RequestMethod.GET)
	public String userEdit() {
		return "user/edit";
	}
	@RequestMapping(value = "menu", method = RequestMethod.GET)
	public String menu() {
		return "menu/list";
	}
	@RequestMapping(value = "menu/edit", method = RequestMethod.GET)
	public String menuEdit() {
		return "menu/edit";
	}
	@RequestMapping(value = "group", method = RequestMethod.GET)
	public String group() {
		return "group/list";
	}
	@RequestMapping(value = "group/user", method = RequestMethod.GET)
	public String groupUser() {
		return "group/user";
	}
	@RequestMapping(value = "group/edit", method = RequestMethod.GET)
	public String groupEdit() {
		return "group/edit";
	}
	@RequestMapping(value = "groupType", method = RequestMethod.GET)
	public String groupType() {
		return "groupType/list";
	}
	@RequestMapping(value = "groupType/edit", method = RequestMethod.GET)
	public String groupTypeEdit() {
		return "groupType/edit";
	}
}
