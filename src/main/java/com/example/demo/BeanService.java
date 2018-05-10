package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeanService {
	@Autowired
	private BeanDao beanDao;
	public Bean selectDeviceId(String deviceId) {
		return beanDao.findBean(deviceId);
	}

}
