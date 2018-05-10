package com.joymeter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joymeter.bean.DeviceInfo;
import com.joymeter.service.DeviceService;

@RestController
@RequestMapping("/api")
public class DeviceController {
	@Autowired
	private DeviceService deviceService;
	
	@RequestMapping("/addDevice" )
	public boolean addDevice(DeviceInfo deviceInfo) {
		System.out.println("开始新增deviceInfo");
		return deviceService.addDevice(deviceInfo);
	}
	@RequestMapping("/selectN")
	public List<DeviceInfo> selectN(DeviceInfo deviceInfo){
		System.out.println("开始查询deviceInfo");
		deviceService.selectN(deviceInfo);
		
		return deviceService.selectN(deviceInfo);
	}
}
