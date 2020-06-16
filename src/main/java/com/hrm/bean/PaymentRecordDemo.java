package com.hrm.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class PaymentRecordDemo {
    //员工编号
    private Integer EMP_ID;
    //缴费月份
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date s1;
    //员工姓名
    private String EMP_NAME;
    //缴费情况
    private Integer s2;
}
