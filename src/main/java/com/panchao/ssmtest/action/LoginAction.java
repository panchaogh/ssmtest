package com.panchao.ssmtest.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginAction {
	@RequestMapping("/LoginAction.login.do")
	public String login(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Œ“ﬂMÅÌ¡À!");
		return "main";
	}
}
