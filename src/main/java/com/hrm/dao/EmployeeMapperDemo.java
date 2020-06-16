package com.hrm.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hrm.bean.EmployeeDemo;
import com.hrm.dto.emp.empDepSearchDTO;

import java.util.Date;
import java.util.List;

public interface EmployeeMapperDemo {
    //插入
    void insertEmp(EmployeeDemo employeeDemo);

    //修改
    void updateEmp(EmployeeDemo employeeDemo);

    /*
    查找数据
     */
    //查询所有
    List<EmployeeDemo> queryAll();
    //根据姓名查询
    List<EmployeeDemo> queryByName(String EMP_NAME);
    //根据编号查询
    EmployeeDemo queryByEmpId(Integer EMP_ID);
    //性别
    List<EmployeeDemo> queryBySex(String SEX);
    //政治面貌
    List<EmployeeDemo> queryByPoliticsStatus(String POLITICS_STATUS);
    //地址
    List<EmployeeDemo> queryByAddress(String ADDRESS);
    //电话号码
    EmployeeDemo queryByTel(String TEL);
    //身份证
    EmployeeDemo queryById(String ID);
    //入职时间
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    List<EmployeeDemo> queryByHiredate(Date HIREDATE);
    //职称
    List<EmployeeDemo> queryByTitle(String TITLE);
    //职位
    List<EmployeeDemo> queryByPosition(String POSITION);
    //权限
    List<EmployeeDemo> queryByPermission(Integer PERMISSION);

    /*
    删除数据
     */
    //删除所有
    int deleteAll();
    //姓名
    int deleteByName(String EMP_NAME);
    //编号
    int deleteByEmpId(Integer EMP_ID);
    //性别
    int deleteBySex(String SEX);
    //政治面貌
    int deleteByPoliticsStatus(String POLITICS_STATUS);
    //地址
    int deleteByAddress(String ADDRESS);
    //电话号码
    int deleteByTel(String TEL);
    //身份证
    int deleteById(String ID);
    //入职时间
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    int deleteByHiredate(Date HIREDATE);
    //职称
    int deleteByTitle(String TITLE);
    //职位
    int deleteByPosition(String POSITION);
    //权限
    int deleteByPermission(Integer PERMISSION);
}
