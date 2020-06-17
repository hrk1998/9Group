package com.hrm.service.impl;

import com.hrm.bean.SalaryDemo;
import com.hrm.dao.SalaryMapper;
import com.hrm.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("salaryService")
@Transactional
public class SalaryServiceImpl implements SalaryService {
    @Autowired
    private SalaryMapper salaryMapper;
    @Override
    public void insertSalary(SalaryDemo salaryDemo) {
        salaryMapper.insertSalary(salaryDemo);
    }

    @Override
    public List<SalaryDemo> queryAll() {
        return salaryMapper.queryAll();
    }

    @Override
    public List<SalaryDemo> queryByEmpId(Integer EMP_ID) {
        return (List<SalaryDemo>) salaryMapper.queryByEmpId(EMP_ID);
    }

    @Override
    public List<SalaryDemo> queryByEmpName(String EMP_NAME) {
        return salaryMapper.queryByEmpName(EMP_NAME);
    }

    @Override
    public List<SalaryDemo> queryByOversal(Integer OVERSAL) {
        return salaryMapper.queryByOversal(OVERSAL);
    }

    @Override
    public List<SalaryDemo> queryByBasesal(Integer BASESAL) {
        return salaryMapper.queryByBasesal(BASESAL);
    }

    @Override
    public List<SalaryDemo> queryByReward(Integer REWARD) {
        return salaryMapper.queryByReward(REWARD);
    }

    @Override
    public List<SalaryDemo> queryBySal(Integer SAL) {
        return salaryMapper.queryBySal(SAL);
    }

    @Override
    public List<SalaryDemo> queryByAllo(Integer ALLO) {
        return salaryMapper.queryByAllo(ALLO);
    }

    @Override
    public List<SalaryDemo> queryByCut(Integer CUT) {
        return salaryMapper.queryByCut(CUT);
    }

    @Override
    public int deleteAll() {
        salaryMapper.deleteAll();
        return 1;
    }

    @Override
    public int deleteByEmpId(Integer EMP_ID) {
        salaryMapper.deleteByEmpId(EMP_ID);
        return 1;
    }

    @Override
    public int deleteByEmpName(String EMP_NAME) {
        salaryMapper.deleteByEmpName(EMP_NAME);
        return 1;
    }

    @Override
    public int deleteByOversal(Integer OVERSAL) {
        salaryMapper.deleteByOversal(OVERSAL);
        return 1;
    }

    @Override
    public int deleteByBasesal(Integer BASESAL) {
        salaryMapper.deleteByBasesal(BASESAL);
        return 1;
    }

    @Override
    public int deleteByReward(Integer REWARD) {
        salaryMapper.deleteByReward(REWARD);
        return 1;
    }

    @Override
    public int deleteBySal(Integer SAL) {
        salaryMapper.deleteBySal(SAL);
        return 1;
    }

    @Override
    public int deleteByAllo(Integer ALLO) {
        salaryMapper.deleteByAllo(ALLO);
        return 1;
    }

    @Override
    public int deleteByCut(Integer CUT) {
        salaryMapper.deleteByCut(CUT);
        return 1;
    }

    @Override
    public int updateByEmpId(Integer EMP_ID) {
        salaryMapper.updateByEmpId(EMP_ID);
        return 1;
    }

    @Override
    public int updateByEmpName(String EMP_NAME) {
        salaryMapper.updateByEmpName(EMP_NAME);
        return 1;
    }

    @Override
    public int updateByOversal(Integer OVERSAL) {
        salaryMapper.updateByOversal(OVERSAL);
        return 1;
    }

    @Override
    public int updateByBasesal(Integer BASESAL) {
        salaryMapper.updateByBasesal(BASESAL);
        return 1;
    }

    @Override
    public int updateByReward(Integer REWARD) {
        salaryMapper.updateByReward(REWARD);
        return 1;
    }

    @Override
    public int updateBySal(Integer SAL) {
        salaryMapper.updateByBasesal(SAL);
        return 1;
    }

    @Override
    public int updateByAllo(Integer ALLO) {
        salaryMapper.deleteByAllo(ALLO);
        return 1;
    }

    @Override
    public int updateByCut(Integer CUT) {
        salaryMapper.deleteByCut(CUT);
        return 1;
    }
}
