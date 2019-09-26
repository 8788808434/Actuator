package com.programme.SpringSecurity.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@RequestMapping("/")
	public String home()
	{
		return "Home";
	}
	@RequestMapping("/login")
	public String loginPage()
	{
		return "login";
	}
	@RequestMapping("/logout-success")
	public String logout()
	{
		return "logout";
	}
	
	@RequestMapping("/user")
	@ResponseBody
	public Principal user(Principal principal)
	{
		return principal;
	}
}
