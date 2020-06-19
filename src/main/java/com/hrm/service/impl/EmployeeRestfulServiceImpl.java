package com.hrm.service.impl;

import com.hrm.bean.EmployeeRestful;
import com.hrm.dao.EmployeeRestfulMapper;
import com.hrm.service.EmployeeRestfulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeRestfulServiceImpl implements EmployeeRestfulService {

    @Autowired
    private EmployeeRestfulMapper employeeRestfulMapper;

    @Override
    public List<EmployeeRestful> list() {
        return employeeRestfulMapper.list();
    }

    @Override
    public void update(EmployeeRestful employeeRestful) {
        employeeRestfulMapper.updateByPrimaryKeySelective(employeeRestful);
    }

    @Override
    public List<EmployeeRestful> listByQueryParam(EmployeeRestful employeeRestful) {
        return employeeRestfulMapper.listByQueryParam(employeeRestful);

    }

    @Override
    public void delete(Integer empId) {
        employeeRestfulMapper.deleteByPrimaryKey(empId);
    }

    @Override
    public void insert(EmployeeRestful employeeRestful) {
        employeeRestfulMapper.insert(employeeRestful);
    }
}
