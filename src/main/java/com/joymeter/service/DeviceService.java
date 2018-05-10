package com.joymeter.service;

import java.util.List;

import com.joymeter.bean.DeviceInfo;

public interface DeviceService {

	boolean addDevice(DeviceInfo deviceInfo);
	List<DeviceInfo> selectN(DeviceInfo deviceInfo);
}
