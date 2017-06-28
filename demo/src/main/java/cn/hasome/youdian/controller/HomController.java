package cn.hasome.youdian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import cn.hasome.youdian.dao.TestDao;

@RestController
public class HomController {
	
	@Autowired
	TestDao testDao;
	
	public Object test(){
		
		return this.testDao.Simple();
		
	}

}
