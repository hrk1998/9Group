package com.hrm.service;

import com.hrm.bean.SalaryParameterDemo;

import java.util.List;

public interface SalaryParameterService {

    void insertSalaryParameter(SalaryParameterDemo salaryParameterDemo);

    List<SalaryParameterDemo> queryAll();

    List<SalaryParameterDemo> queryByEmpId(Integer EMP_ID);

    List<SalaryParameterDemo> queryByDBPF(Integer DBPF);

    List<SalaryParameterDemo> queryByIDB(Integer IDB);

    List<SalaryParameterDemo> queryByITB(Integer ITB);

    int deleteAll();

    int deleteByEmpId(Integer EMP_ID);

    int deleteByDBPF(Integer DBPF);

    int deleteByIDB(Integer IDB);

    int deleteByITB(Integer ITB);

    int updateEmpId(Integer EMP_ID);

    int updateDBPF(Integer DBPF);

    int updateIDB(Integer IDB);

    int updateITB(Integer ITB);
}
