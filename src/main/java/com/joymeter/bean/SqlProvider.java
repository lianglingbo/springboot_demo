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

	/**
	 * 多条件动态查询所有结果
	 * <p>Title: selectN</p>  
	 * <p>Description: </p>  
	 * @param deviceInfo
	 * @return  
	 * @author liang  
	 * @date 2018年5月11日  
	 * @version 1.0
	 */
	public String selectN(final DeviceInfo deviceInfo) {
		return new SQL() {
			{
				SELECT ("deviceId,gatewayId,simId,project,province,city,district,community,address,readState,valveState,deviceState,simState,dataUsed");
				FROM ("device_info");
				if(deviceInfo.getDeviceId() != null) {
					WHERE("deviceId=#{deviceId}");
				}
				if(deviceInfo.getGatewayId() != null) {
					WHERE("gatewayId=#{gatewayId}");
				}
				if(deviceInfo.getSimId() != null) {
					WHERE("simId=#{simId}");
				}
				if(deviceInfo.getProject() != null) {
					WHERE("project=#{project}");
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
				if(deviceInfo.getCommunity()  != null) {
					WHERE("community=#{community}");
				}
				if(deviceInfo.getAddress()  != null) {
					WHERE("address=#{address}");
				}
				if(deviceInfo.getReadState()  != null) {
					WHERE("readState=#{readState}");
				}
				if(deviceInfo.getValveState()  != null) {
					WHERE("valveState=#{valveState}");
				}
				if(deviceInfo.getDeviceState()  != null) {
					WHERE("deviceState=#{deviceState}");
				}
				if(deviceInfo.getSimState()  != null) {
					WHERE("simState=#{simState}");
				}
				if(deviceInfo.getDataUsed()  != null) {
					WHERE("dataUsed=#{dataUsed}");
				}
				 
			}
		}.toString();
	}
}
