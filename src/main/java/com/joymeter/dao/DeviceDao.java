package com.joymeter.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import com.joymeter.bean.DeviceInfo;
import com.joymeter.bean.SqlProvider;

@Mapper
public interface  DeviceDao {
	@Insert("insert into info (deviceId,status,province,city,district) values (#{deviceId},#{status},#{province},#{city},#{district})")
	void addDevice(DeviceInfo deviceInfo);
	
	//使用动态查询语句
	@SelectProvider(type=SqlProvider.class , method="selectN")
	List<DeviceInfo> selectN(DeviceInfo deviceInfo);
	
}
