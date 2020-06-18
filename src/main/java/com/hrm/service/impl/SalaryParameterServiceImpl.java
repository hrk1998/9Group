package com.hrm.service.impl;

import com.hrm.bean.SalaryParameterDemo;
import com.hrm.dao.SalaryParameterMapper;
import com.hrm.service.SalaryParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("SalaryParameterService")
@Transactional
public class SalaryParameterServiceImpl implements SalaryParameterService {
    @Autowired
    private SalaryParameterMapper salaryParameterMapper;

    @Override
    public void insertSalaryParameter(SalaryParameterDemo salaryParameterDemo){
        salaryParameterMapper.insertSalaryParameter(salaryParameterDemo);
    }

    @Override
    public List<SalaryParameterDemo> queryAll(){
        return salaryParameterMapper.queryAll();
    }

    @Override
    public List<SalaryParameterDemo> queryByEmpId(Integer EMP_ID){
        return salaryParameterMapper.queryByEmpId(EMP_ID);
    }

    @Override
    public List<SalaryParameterDemo> queryByDBPF(Integer DBPF){
        return salaryParameterMapper.queryByDBPF(DBPF);
    }

    @Override
    public List<SalaryParameterDemo> queryByIDB(Integer IDB){
        return salaryParameterMapper.queryByIDB(IDB);
    }

    @Override
    public List<SalaryParameterDemo> queryByITB(Integer ITB){
        return salaryParameterMapper.queryByITB(ITB);
    }

    @Override
    public int deleteAll(){
        salaryParameterMapper.deleteAll();
        return 1;
    }

    @Override
    public int deleteByEmpId(Integer EMP_ID){
        salaryParameterMapper.deleteByEmpId(EMP_ID);
        return 1;
    }

    @Override
    public int deleteByDBPF(Integer DBPF){
        salaryParameterMapper.deleteByDBPF(DBPF);
        return 1;
    }

    @Override
    public int deleteByIDB(Integer IDB){
        salaryParameterMapper.deleteByIDB(IDB);
        return 1;
    }

    @Override
    public int deleteByITB(Integer ITB){
        salaryParameterMapper.deleteByITB(ITB);
        return 1;
    }

    @Override
    public int updateEmpId(Integer EMP_ID){
        salaryParameterMapper.updateEmpId(EMP_ID);
        return 1;
    }

    @Override
    public int updateDBPF(Integer DBPF){
        salaryParameterMapper.updateDBPF(DBPF);
        return 1;
    }

    @Override
    public int updateIDB(Integer IDB){
        salaryParameterMapper.updateIDB(IDB);
        return 1;
    }

    @Override
    public int updateITB(Integer ITB){
        salaryParameterMapper.updateITB(ITB);
        return 1;
    }
}
