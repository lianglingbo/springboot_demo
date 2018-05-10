package com.joymeter.bean;

import org.apache.ibatis.jdbc.SQL;

/**
 * 
* <p>Title: SqlProvider</p>  
* <p>Description:动态查询语句 </p>  
* @author liang  
* @date 2018年5月10日
 */
public class SqlProvider {

	public String selectN(final DeviceInfo deviceInfo) {
		return new SQL() {
			{
				SELECT ("deviceId,status,province,city,district");
				FROM ("info");
				if(deviceInfo.getDeviceId() != null) {
					WHERE("deviceId=#{deviceId}");
				}
				if(deviceInfo.getStatus()  != null) {
					WHERE("status=#{status}");
				}
				if(deviceInfo.getProvince()  != null) {
					WHERE("province=#{province}");
				}
				if(deviceInfo.getCity()  != null) {
					WHERE("city=#{city}");
				}
				if(deviceInfo.getDistrict()  != null) {
					WHERE("district=#{district}");
				}
				 
			}
		}.toString();
	}
}
