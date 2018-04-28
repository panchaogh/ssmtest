package com.panchao.ssmtest.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.panchao.ssmtest.entity.Test;
import com.panchao.ssmtest.service.ITestService;

@Controller
public class LoginAction {
    private Logger logger = Logger.getLogger(this.getClass());
    @Autowired
    private ITestService testService;

    @RequestMapping("/LoginAction.login.do")
    public String login(HttpServletRequest request, HttpServletResponse response) {
        logger.info("------------------------------Log4j测试开始......----------------------------------");
        List<Test> list = testService.selectTest();
        for (Test test : list) {
            System.out.println(test);
        }
        logger.error("-------------------测试error---------------------");
        System.out.println("我進來了!");
        logger.info("------------------------------Log4j测试结束----------------------------------");
        return "main";
    }
}
