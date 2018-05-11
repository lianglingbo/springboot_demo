package com.joymeter.bean;

/**
 * 设备信息实体类
* <p>Title: DeviceInfo</p>  
* <p>Description: </p>  
* @author liang  
* @date 2018年5月11日
 */
public class DeviceInfo {
	private String deviceId;//设备编号
	private String gatewayId;//设备编号
	private String simId;//SIM卡ID
	private String project;//项目名称
	private String province;
	private String city;
	private String district;
	private String community;//小区
	private String address;
	private String readState;//抄表状态(0 成功, 1 失败)
	private String valveState;//阀门状态(0 关, 1 开)
	private String deviceState;//设备状态(0 离线, 1 在线)
	private String simState;//SIM卡状态(0 正常, 1 欠费)
	private String dataUsed;//已使用的流量
	 
	public String getReadState() {
		return readState;
	}
	public void setReadState(String readState) {
		this.readState = readState;
	}
	public String getGatewayId() {
		return gatewayId;
	}
	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
	}
	public String getSimId() {
		return simId;
	}
	public void setSimId(String simId) {
		this.simId = simId;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getCommunity() {
		return community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getValveState() {
		return valveState;
	}
	public void setValveState(String valveState) {
		this.valveState = valveState;
	}
	public String getDeviceState() {
		return deviceState;
	}
	public void setDeviceState(String deviceState) {
		this.deviceState = deviceState;
	}
	public String getSimState() {
		return simState;
	}
	public void setSimState(String simState) {
		this.simState = simState;
	}
	public String getDataUsed() {
		return dataUsed;
	}
	public void setDataUsed(String dataUsed) {
		this.dataUsed = dataUsed;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	@Override
	public String toString() {
		return "DeviceInfo [deviceId=" + deviceId + ", gatewayId=" + gatewayId + ", simId=" + simId + ", project="
				+ project + ", province=" + province + ", city=" + city + ", district=" + district + ", community="
				+ community + ", address=" + address + ", readState=" + readState + ", valveState=" + valveState
				+ ", deviceState=" + deviceState + ", simState=" + simState + ", dataUsed=" + dataUsed + "]";
	}
	 
	
}
