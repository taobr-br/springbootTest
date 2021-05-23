package com.example.demo.dao;

import com.example.demo.pojo.CorrectRatePojo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 测试一对多接口
 */
@Mapper
public interface CorrectRateDao {
   List<CorrectRatePojo> queryCorrectRateList(String businessNo);
}
