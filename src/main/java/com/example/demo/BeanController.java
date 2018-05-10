package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class BeanController {
	@Autowired
	private BeanService beanService;
	@RequestMapping("/query")
	public Bean  testQuery() {
		return beanService.selectDeviceId("1");
	}
}
