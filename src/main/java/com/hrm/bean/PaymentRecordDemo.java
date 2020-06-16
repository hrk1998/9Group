package com.hrm.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class PaymentRecordDemo {
    //员工编号
    private Integer EMP_ID;
    //缴费月份
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date Month;
    //员工姓名
    private String EMP_NAME;
    //缴费情况
    private String PAYMENT;

    public Integer getEMP_ID() {
        return EMP_ID;
    }

    public void setEMP_ID(Integer EMP_ID) {
        this.EMP_ID = EMP_ID;
    }

    public Date getMonth() {
        return Month;
    }

    public void setMonth(Date month) {
        Month = month;
    }

    public String getEMP_NAME() {
        return EMP_NAME;
    }

    public void setEMP_NAME(String EMP_NAME) {
        this.EMP_NAME = EMP_NAME;
    }

    public String getPAYMENT() {
        return PAYMENT;
    }

    public void setPAYMENT(String PAYMENT) {
        this.PAYMENT = PAYMENT;
    }
}
