package com.hrm.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hrm.bean.InstitutionDemo;
import com.hrm.bean.PaymentRecordDemo;

import java.util.Date;
import java.util.List;

public interface PaymentRecordMapperDemo {
    //插入
    void insertPaymentRecord(PaymentRecordDemo paymentRecordDemo);

    //修改
    void updatePaymentRecord(PaymentRecordDemo paymentRecordDemo);

    /*
    查找数据
     */
    //查询所有
    List<PaymentRecordDemo> queryAll();
    //员工编号
    PaymentRecordDemo queryByEmpId(Integer EMP_ID);
    //缴费月份
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    List<PaymentRecordDemo> queryByMonth(Date Month);
    //员工姓名
    List<PaymentRecordDemo> queryByEmpName(String EMP_NAME);
    //缴费情况
    List<PaymentRecordDemo> queryByPayment(String PAYMENT);


    /*
    删除数据
     */
    //删除所有
    int deleteAll();
    //员工编号
    int deleteByEmpId(Integer EMP_ID);
    //缴费月份
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    int deleteByMonth(Date Month);
    //员工姓名
    int deleteByEmpName(String EMP_NAME);
    //缴费情况
    int deleteByPayment(String PAYMENT);
}
