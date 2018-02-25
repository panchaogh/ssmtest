package com.panchao.ssmtest.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.panchao.ssmtest.dao.TestMapper;
import com.panchao.ssmtest.entity.Test;

@Controller
public class LoginAction {
	@Autowired
	private TestMapper testMapper;
	@RequestMapping("/LoginAction.login.do")
	public String login(HttpServletRequest request, HttpServletResponse response) {
		List<Test> list = testMapper.selectTest();
		for (Test test : list) {
			System.out.println(test);
		}
		System.out.println("Œ“ﬂMÅÌ¡À!");
		return "main";
	}
}
