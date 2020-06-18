package com.hrm.dao;

import com.hrm.bean.SalaryDemo;
import com.hrm.bean.SalaryParameterDemo;

import java.util.List;

/*
对工资操作表进行操作
 */
public interface SalaryParameterMapper {
    //插入
    void insertSalaryParameter(SalaryParameterDemo salaryParameterDemo);


    /*
    查找数据
     */
    //查询所有
    List<SalaryParameterDemo> queryAll();
    //员工编号
    SalaryParameterDemo queryByEmpId(Integer EMP_ID);
    //公积金缓存系数
    List<SalaryParameterDemo> queryByDBPF(Integer DBPF);
    //保险激存系数
    List<SalaryParameterDemo> queryByIDB(Integer IDB);
    //所得税系数
    List<SalaryParameterDemo> queryByITB(Integer ITB);


    /*
    删除数据
     */
    //删除所有
    int deleteAll();
    //员工编号
    int deleteByEmpId(Integer EMP_ID);
    //公积金缓存系数
    int deleteByDBPF(Integer DBPF);
    //保险激存系数
    int deleteByIDB(Integer IDB);
    //所得税系数
    int deleteByITB(Integer ITB);

    /*
    更新数据
     */
    //员工编号
    int updateEmpId(Integer EMP_ID);
    //公积金缓存系数
    int updateDBPF(Integer DBPF);
    //保险激存系数
    int updateIDB(Integer IDB);
    //所得税系数
    int updateITB(Integer ITB);
}
