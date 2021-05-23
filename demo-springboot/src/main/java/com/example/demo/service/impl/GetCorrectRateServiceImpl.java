package com.example.demo.service.impl;

import com.example.demo.dao.CorrectRateDao;
import com.example.demo.pojo.CorrectRatePojo;
import com.example.demo.service.GetCorrectRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("GetCorrectRateService")
public class GetCorrectRateServiceImpl implements GetCorrectRateService {

    @Autowired(required=false)
    private CorrectRateDao correctRateDao;

    @Override
    public List<CorrectRatePojo> queryCorrectRateList(String businessNo) {
        List<CorrectRatePojo> list = correctRateDao.queryCorrectRateList(businessNo);
        return list;
    }
}
