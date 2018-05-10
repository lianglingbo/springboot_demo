package com.joymeter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joymeter.bean.DeviceInfo;
import com.joymeter.dao.DeviceDao;

@Service
public class DeviceServiceImpl implements DeviceService {

	@Autowired
	private DeviceDao deviceDao;
	@Override
	public boolean addDevice(DeviceInfo deviceInfo) {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			deviceDao.addDevice(deviceInfo);
			flag=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * 动态查询
	 */
	@Override
	public List<DeviceInfo> selectN(DeviceInfo deviceInfo) {
		// TODO Auto-generated method stub
		try {
			return deviceDao.selectN(deviceInfo);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
