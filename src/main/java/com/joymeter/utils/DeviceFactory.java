package com.joymeter.utils;

import java.util.ArrayList;

import org.junit.Test;

import com.joymeter.bean.DeviceInfo;

public class DeviceFactory {

	/**
	 * 随机生成deviceinfo信息
	 * 防止重复插入机制
	 * deviceId,gatewayId,simId,project,province,city,district,community,address,readState,valveState,deviceState,simState,dataUsed"
	* @Title: newDevice
	* @Description: TODO
	* @param @return    设定文件
	* @return DeviceInfo    返回类型
	* @throws
	 */
	private static ArrayList<DeviceInfo> deviceArr = new ArrayList<DeviceInfo> ();
	
	/**
	 * 构造地址信息数组
	* <p>Title: </p>
	* <p>Description: </p>
	 */
	static {
		DeviceInfo device1 = new DeviceInfo();
		DeviceInfo device2 = new DeviceInfo();
		DeviceInfo device3 = new DeviceInfo();
		DeviceInfo device4= new DeviceInfo();
		DeviceInfo device5 = new DeviceInfo();
		device1.setProject("项目1");
		device1.setProvince("浙江省");
		device1.setCity("杭州市");
		device1.setDistrict("江干区");
		device1.setCommunity("万家花园");
		device1.setAddress("1号楼");
		
		device2.setProject("项目2");
		device2.setProvince("浙江省");
		device2.setCity("杭州市");
		device2.setDistrict("滨江区");
		device2.setCommunity("龙湖春江");
		device2.setAddress("4号楼");
		
		device3.setProject("项目3");
		device3.setProvince("江西省");
		device3.setCity("南昌市");
		device3.setDistrict("红谷滩");
		device3.setCommunity("南昌市公安局");
		device3.setAddress("515");
		
		device4.setProject("项目4");
		device4.setProvince("江西省");
		device4.setCity("南昌市");
		device4.setDistrict("南昌县");
		device4.setCommunity("正荣大湖之都");
		device4.setAddress("27栋");
		
		device5.setProject("项目5");
		device5.setProvince("福建省");
		device5.setCity("莆田市");
		device5.setDistrict("城厢区");
		device5.setCommunity("胜利路");
		device5.setAddress("xx号店");
		//赋给数组
		deviceArr.add(device1);
		deviceArr.add(device2);
		deviceArr.add(device3);
		deviceArr.add(device4);
		deviceArr.add(device5);	
	}
	/**
	 * 返回随机生成的device对象
	* @Title: newDevice
	* @Description: TODO
	* @param @return    设定文件
	* @return DeviceInfo    返回类型
	* @throws
	 */
	public static DeviceInfo newDevice() {
		DeviceInfo deviceInfo = new DeviceInfo();
		//deviceId 和 simId 随机数生成
		int id = (int)(Math.random()*1000);
		deviceInfo.setDeviceId(String.valueOf(id));
		deviceInfo.setSimId(String.valueOf(id));
		deviceInfo.setDataUsed(String.valueOf((int)(Math.random()*10000)));
		deviceInfo.setGatewayId(String.valueOf((int)(Math.random()*10000)));
		deviceInfo.setReadState(String.valueOf((Math.random()>0.5?1:0)));
		deviceInfo.setValveState(String.valueOf((Math.random()>0.5?1:0)));
		deviceInfo.setSimState(String.valueOf((Math.random()>0.5?1:0)));
		deviceInfo.setDeviceState(String.valueOf((Math.random()>0.5?1:0)));
		//其他信息使用数组中的信息,随机选择一项
		int addrIndex= (int)(Math.random()*10)/2;
		System.out.println("数组deviceArr:"+deviceArr.toString());
		System.out.println("addrIndex:"+addrIndex);
		
		DeviceInfo d1 = deviceArr.get(addrIndex);
		deviceInfo.setProject(d1.getProject());
		deviceInfo.setProvince(d1.getProvince());
		deviceInfo.setCity(d1.getCity());
		deviceInfo.setCommunity(d1.getCommunity());
		deviceInfo.setDistrict(d1.getDistrict());
		deviceInfo.setAddress(d1.getAddress());
		return deviceInfo;
		
	}
	@Test
	public void fun() {
		String string = newDevice().toString();
		System.out.println(string);
	}
	
}
