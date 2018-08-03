package com.panchao.ssmtest.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 11:57 2018/8/3
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
public class ITestServiceTest {
    @Autowired
    private ITestService testService;
    @Test
    public void selectTest() {
        List<com.panchao.ssmtest.entity.Test> list = testService.selectTest();
        System.out.println(Arrays.toString(list.toArray()));
    }
}