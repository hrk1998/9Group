package com.hrm.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hrm.bean.ChangeDemo;
import com.hrm.bean.PositionDemo;

import java.util.Date;
import java.util.List;

/*
对员工调动信息表进行操作
 */
public interface ChangeMapperDemo {
    //插入
    void insertChange(ChangeDemo changeDemo);

    //修改
    void updateChange(ChangeDemo changeDemo);

    /*
    查找数据
     */
    //查询所有
    List<ChangeDemo> queryAll();
    //员工编号
    List<ChangeDemo> queryByEmpId(Integer EMP_ID);
    //员工姓名
    List<ChangeDemo> queryByEmpName(String EMP_NAME);
    //调动编号
    ChangeDemo queryByChangeId(Integer CHANGE_ID);
    //日期
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    List<ChangeDemo> queryByChangeDate(Date CHANGE_D);
    //调动原因
    List<ChangeDemo> queryByReason(String REASON);



    /*
    删除数据
     */
    //删除所有
    int deleteAll();
    //员工编号
    int deleteByEmpId(Integer EMP_ID);
    //员工姓名
    int deleteByEmpName(String EMP_NAME);
    //调动编号
    int deleteByChangeId(Integer CHANGE_ID);
    //日期
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    int deleteByChangeDate(Date CHANGE_D);
    //调动原因
    int deleteByReason(String REASON);
}
