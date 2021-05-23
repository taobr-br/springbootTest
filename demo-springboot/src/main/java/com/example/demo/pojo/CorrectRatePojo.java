package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CorrectRatePojo implements Serializable {
    //双录流水号
    private String businessNo;
    //双录创建时间
    private Date createDate;
    //类型
    private String type;
    //名字
    private String name;
    //正确率列表
    private List<String> correctRateList;

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCorrectRateList() {
        return correctRateList;
    }

    public void setCorrectRateList(List<String> correctRateList) {
        this.correctRateList = correctRateList;
    }
}
