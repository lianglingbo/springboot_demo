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
	 * 注册接口dao
	* @Title: addDeviceInfo
	* @Description: TODO
	* @param @param deviceInfo
	* @param @return    设定文件
	* @return String    返回类型
	* @throws
	 */
	public String addDeviceInfo(final DeviceInfo deviceInfo) {
		return new SQL() {
			{
				INSERT_INTO ("device_info");
				INTO_COLUMNS("deviceId","gatewayId","simId","project","province","city","district","community","address","readState","valveState","deviceState","simState","dataUsed");
				INTO_VALUES ("#{deviceId}","#{gatewayId}","#{simId}","#{project}","#{province}","#{city}","#{district}","#{community}","#{address}","#{readState}","#{valveState}","#{deviceState}","#{simState}","#{dataUsed}");
			}
		}.toString();
	}
	
	/**
	 * 根据simid更新数据
	* @Title: updateDeviceInfoBySim
	* @Description: TODO
	* @param @param deviceInfo
	* @param @return    设定文件
	* @return String    返回类型
	* @throws
	 */
	public String updateDeviceInfoBySim(final DeviceInfo deviceInfo) {
		return new SQL() {
			{
				UPDATE("device_info");
				//多条件
				if(deviceInfo.getGatewayId() != null) {
					SET("gatewayId=#{gatewayId}");
				}
				if(deviceInfo.getProject() != null) {
					SET("project=#{project}");
				}
				if(deviceInfo.getProvince()  != null) {
					SET("province=#{province}");
				}
				if(deviceInfo.getCity()  != null) {
					SET("city=#{city}");
				}
				if(deviceInfo.getDistrict()  != null) {
					SET("district=#{district}");
				}
				if(deviceInfo.getCommunity()  != null) {
					SET("community=#{community}");
				}
				if(deviceInfo.getAddress()  != null) {
					SET("address=#{address}");
				}
				if(deviceInfo.getReadState()  != null) {
					SET("readState=#{readState}");
				}
				if(deviceInfo.getValveState()  != null) {
					SET("valveState=#{valveState}");
				}
				if(deviceInfo.getDeviceState()  != null) {
					SET("deviceState=#{deviceState}");
				}
				if(deviceInfo.getSimState()  != null) {
					SET("simState=#{simState}");
				}
				if(deviceInfo.getDataUsed()  != null) {
					SET("dataUsed=#{dataUsed}");
				}
				 WHERE("simId=#{simId}");  
			}
		}.toString();
	}
	
	/**
	 * 根据deviceid更新数据
	* @Title: updateDeviceInfoByDeviceId
	* @Description: TODO
	* @param @param deviceInfo
	* @param @return    设定文件
	* @return String    返回类型
	* @throws
	 */
	public String updateDeviceInfoByDeviceId(final DeviceInfo deviceInfo) {
		return new SQL() {
			{
				UPDATE("device_info");
				//多条件
				if(deviceInfo.getGatewayId() != null) {
					SET("gatewayId=#{gatewayId}");
				}
				if(deviceInfo.getProject() != null) {
					SET("project=#{project}");
				}
				if(deviceInfo.getProvince()  != null) {
					SET("province=#{province}");
				}
				if(deviceInfo.getCity()  != null) {
					SET("city=#{city}");
				}
				if(deviceInfo.getDistrict()  != null) {
					SET("district=#{district}");
				}
				if(deviceInfo.getCommunity()  != null) {
					SET("community=#{community}");
				}
				if(deviceInfo.getAddress()  != null) {
					SET("address=#{address}");
				}
				if(deviceInfo.getReadState()  != null) {
					SET("readState=#{readState}");
				}
				if(deviceInfo.getValveState()  != null) {
					SET("valveState=#{valveState}");
				}
				if(deviceInfo.getDeviceState()  != null) {
					SET("deviceState=#{deviceState}");
				}
				if(deviceInfo.getSimState()  != null) {
					SET("simState=#{simState}");
				}
				if(deviceInfo.getDataUsed()  != null) {
					SET("dataUsed=#{dataUsed}");
				}
				 WHERE("deviceId=#{deviceId}");  
			}
		}.toString();
	}

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
