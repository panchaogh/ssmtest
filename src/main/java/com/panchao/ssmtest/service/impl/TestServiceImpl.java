package com.panchao.ssmtest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panchao.ssmtest.dao.TestMapper;
import com.panchao.ssmtest.entity.Test;
import com.panchao.ssmtest.service.ITestService;
@Service("testService")
public class TestServiceImpl implements ITestService {
	@Autowired
	private TestMapper testMapper;
	@Override
	public List<Test> selectTest() {
		return testMapper.selectTest();
	}

}
