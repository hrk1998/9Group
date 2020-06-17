package com.hrm.service;

import java.util.List;
import com.hrm.bean.SalaryDemo;

public interface SalaryService {

    void insertSalary(SalaryDemo salaryDemo);
    List<SalaryDemo> queryAll();

    List<SalaryDemo> queryByEmpId(Integer EMP_ID);

    List<SalaryDemo> queryByEmpName(String EMP_NAME);

    List<SalaryDemo> queryByOversal(Integer OVERSAL);

    List<SalaryDemo> queryByBasesal(Integer BASESAL);

    List<SalaryDemo> queryByReward(Integer REWARD);

    List<SalaryDemo> queryBySal(Integer SAL);

    List<SalaryDemo> queryByAllo(Integer ALLO);

    List<SalaryDemo> queryByCut(Integer CUT);

    int deleteAll();

    int deleteByEmpId(Integer EMP_ID);

    int deleteByEmpName(String EMP_NAME);

    int deleteByOversal(Integer OVERSAL);

    int deleteByBasesal(Integer BASESAL);

    int deleteByReward(Integer REWARD);

    int deleteBySal(Integer SAL);

    int deleteByAllo(Integer ALLO);

    int deleteByCut(Integer CUT);

    int updateByEmpId(Integer EMP_ID);

    int updateByEmpName(String EMP_NAME);

    int updateByOversal(Integer OVERSAL);

    int updateByBasesal(Integer BASESAL);

    int updateByReward(Integer REWARD);

    int updateBySal(Integer SAL);

    int updateByAllo(Integer ALLO);

    int updateByCut(Integer CUT);
}
