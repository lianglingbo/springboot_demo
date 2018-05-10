package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BeanDao {
	@Select("select * from info where deviceId = #{deviceId}")
	Bean findBean(@Param("deviceId") String deviceId);
}
