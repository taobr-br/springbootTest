package com.example.demo.controller;

import com.example.demo.pojo.CorrectRatePojo;
import com.example.demo.service.GetCorrectRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "taobr")
@Controller
public class indexController {

    @Autowired
    private GetCorrectRateService getCorrectRateService;
    //获取正确率接口
    @GetMapping("correctRate.do")
    @ResponseBody
    public List<CorrectRatePojo> getCorrectRate(String businessNo) throws Exception {
        if(businessNo !=null){
            List<CorrectRatePojo>  result =  getCorrectRateService.queryCorrectRateList(businessNo);
            return result;
        }
        return null;
    }

}
