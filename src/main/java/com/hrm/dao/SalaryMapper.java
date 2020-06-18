package com.hrm.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hrm.bean.RecruitDemo;
import com.hrm.bean.SalaryDemo;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository("salaryDao")
/*
对工资表进行操作
 */
public interface SalaryMapper {
    //插入
    void insertSalary(SalaryDemo salaryDemo);

    /*
    查找数据
     */
    //查询所有
    List<SalaryDemo> queryAll();
    //员工编号
    List<SalaryDemo> queryByEmpId(Integer EMP_ID);
    //员工姓名
    List<SalaryDemo> queryByEmpName(String EMP_NAME);
    //加班费
    List<SalaryDemo> queryByOversal(Integer OVERSAL);
    //基本工资
    List<SalaryDemo> queryByBasesal(Integer BASESAL);
    //奖金
    List<SalaryDemo> queryByReward(Integer REWARD);
    //实发工资
    List<SalaryDemo> queryBySal(Integer SAL);
    //补贴
    List<SalaryDemo> queryByAllo(Integer ALLO);
    //扣款
    List<SalaryDemo> queryByCut(Integer CUT);


    /*
    删除数据
     */
    //删除所有
    int deleteAll();
    //员工编号
    int deleteByEmpId(Integer EMP_ID);
    //员工姓名
    int deleteByEmpName(String EMP_NAME);
    //加班费
    int deleteByOversal(Integer OVERSAL);
    //基本工资
    int deleteByBasesal(Integer BASESAL);
    //奖金
    int deleteByReward(Integer REWARD);
    //实发工资
    int deleteBySal(Integer SAL);
    //补贴
    int deleteByAllo(Integer ALLO);
    //扣款
    int deleteByCut(Integer CUT);

    // update

    //员工编号
    int updateByEmpId(Integer EMP_ID);
    //员工姓名
    int updateByEmpName(String EMP_NAME);
    //加班费
    int updateByOversal(Integer OVERSAL);
    //基本工资
    int updateByBasesal(Integer BASESAL);
    //奖金
    int updateByReward(Integer REWARD);
    //实发工资
    int updateBySal(Integer SAL);
    //补贴
    int updateByAllo(Integer ALLO);
    //扣款
    int updateByCut(Integer CUT);
}
