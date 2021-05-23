package com.example.demo.service;

import com.example.demo.pojo.CorrectRatePojo;

import java.util.List;

public interface GetCorrectRateService {
    List<CorrectRatePojo> queryCorrectRateList(String businessNo);
}
