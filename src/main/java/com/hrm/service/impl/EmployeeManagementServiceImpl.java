package com.hrm.service.impl;

import com.hrm.bean.EmployeeDemo;
import com.hrm.dao.EmployeeManagementMapper;
import com.hrm.dao.EmployeeMapperDemo;
import com.hrm.service.EmployeeManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class EmployeeManagementServiceImpl implements EmployeeManagementService {

    @Autowired
    private EmployeeManagementMapper employeeManagementMapper;


    @Override
    public List<Map<String,Object>> sexRatio() {
        return employeeManagementMapper.getSexRatio();
    }

    @Override
    public List<Map<String,Object>> positionRatio() {
        return employeeManagementMapper.getPositionRatio();
    }

    @Override
    public List<Map<String,Object>> titleRatio() {
        return employeeManagementMapper.getTitleRatio();
    }

    @Override
    public List<Map<String,Object>> eduLvRatio() {
        return employeeManagementMapper.getEduLvRatio();
    }
}
