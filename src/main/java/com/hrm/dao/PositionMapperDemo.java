package com.hrm.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hrm.bean.EmployeeDemo;
import com.hrm.bean.PositionDemo;

import java.util.Date;
import java.util.List;

/*
对职位表进行操作
 */
public interface PositionMapperDemo {
    //插入
    void insertPosition(PositionDemo positionDemo);

    //修改
    void updatePosition(PositionDemo positionDemo);

    /*
    查找数据
     */
    //查询所有
    List<PositionDemo> queryAll();
    //员工编号
    PositionDemo queryByPosEmpId(Integer EMP_ID);
    //职位编号
    PositionDemo queryByPosId(Integer POS_ID);
    //职位名称
    PositionDemo queryByPosName(String POS_NAME);
    //职位职能
    PositionDemo queryByPosFunc(String POS_FUNC);


    /*
    删除数据
     */
    //删除所有
    int deleteAll();
    //员工编号
    int deleteByPosEmpId(Integer EMP_ID);
    //职位编号
    int deleteByPosId(Integer POS_ID);
    //职位名称
    int deleteByPosName(String POS_NAME);
    //职位职能
    int deleteByPosFunc(String POS_FUNC);
}
