package com.joymeter.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.abel533.echarts.Legend;
import com.github.abel533.echarts.Option;
import com.github.abel533.echarts.Title;
import com.github.abel533.echarts.Tooltip;
import com.github.abel533.echarts.code.Orient;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.series.Pie;
import com.joymeter.bean.DeviceInfo;
import com.joymeter.service.DeviceService;
import com.joymeter.utils.DeviceFactory;

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
	
	@RequestMapping("/addDeviceData")
	public void addDeviceData(DeviceInfo deviceInfo) {
		System.out.println("开始插入");
		deviceService.addDeviceData(deviceInfo);
	}
	
	
	/**
	 * 模拟设备注册接口
	* @Title: insertClient
	* @Description: TODO
	* @param     设定文件
	* @return void    返回类型
	* @throws
	 */
	@RequestMapping("/client")
	public void insertClient() {
		for(int i = 0;i<100;i++) {
			System.out.println("插入第"+i+"条");
			deviceService.addDeviceData(DeviceFactory.newDevice());
		}
	}
	
	/**
	 * 更新接口ByDeviceId
	* @Title: updateDeviceInfoByDeviceId
	* @Description: TODO
	* @param @param deviceInfo
	* @param @return    设定文件
	* @return int    返回类型
	* @throws
	 */
	@RequestMapping("/update/byDeviceId")
	public int updateDeviceInfoByDeviceId(DeviceInfo deviceInfo) {
		return deviceService.updateDeviceInfoByDeviceId(deviceInfo);
	}
	
	/**
	 * 更新接口BySim
	* @Title: updateDeviceInfoBySim
	* @Description: TODO
	* @param @param deviceInfo
	* @param @return    设定文件
	* @return int    返回类型
	* @throws
	 */
	@RequestMapping("/update/bySim")
	public int updateDeviceInfoBySim(DeviceInfo deviceInfo) {
		return deviceService.updateDeviceInfoByDeviceId(deviceInfo);
	}
	//测试echarts
	@RequestMapping("/test")
	public Option getEcharts() {
		Option option = new Option();
        //标题
        Title title = new Title();
        title.setText("设备离线率");
        title.setSubtext("");
        title.setX("center");
        option.setTitle(title);
        //提示框
        Tooltip tooltip = new Tooltip();
        tooltip.setTrigger(Trigger.item);
        tooltip.formatter("{a} <br/>{b} : {c} ({d}%)");
        option.setTooltip(tooltip);
        //Legend
        Legend legend = new Legend();
        List<String> legendDataList = Arrays.asList("90年代", "00年代", "10年代","其他");
        legend.setOrient(Orient.vertical);
        legend.setLeft("left");
        legend.setData(legendDataList);
        option.setLegend(legend);
      //饼状图
        Pie pie = new Pie();
        //对数据进行简单处理
        int y90 =0;
        int y00 =0;
        int y10 =0;
        int yElse =0;
        Map<String,String> dataMap90 = new HashMap<>();
        dataMap90.put("name","90年代");
        dataMap90.put("value",String.valueOf(y90));
        Map<String,String> dataMap00 = new HashMap<>();
        dataMap00.put("name","00年代");
        dataMap00.put("value",String.valueOf(y00));
        Map<String,String> dataMap10 = new HashMap<>();
        dataMap10.put("name","10年代");
        dataMap10.put("value",String.valueOf(y10));
        Map<String,String> dataMapElse = new HashMap<>();
        dataMapElse.put("name","其他");
        dataMapElse.put("value",String.valueOf(yElse));
        //封装pie
        pie.data(dataMap90, dataMap00, dataMap10, dataMapElse);
        pie.setName("上映年代");
        pie.setRadius("55%");
        String [] centerArray = {"50%","60%"};
        pie.setCenter(centerArray);

        option.series(pie);

        return option;
	}
}
