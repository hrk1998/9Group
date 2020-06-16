package com.hrm.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hrm.bean.EmployeeDemo;
import com.hrm.bean.PositionDemo;

import java.util.Date;
import java.util.List;

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
    //职位编号
    int deleteByPosId(Integer POS_ID);
    //职位名称
    int deleteByPosName(String POS_NAME);
    //职位职能
    int deleteByPosFunc(String POS_FUNC);
}
