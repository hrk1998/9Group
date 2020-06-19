package com.hrm.dao;


import com.hrm.bean.EmployeeRestful;

import java.util.List;

public interface EmployeeRestfulMapper {
    int deleteByPrimaryKey(Integer empId);

    int insert(EmployeeRestful record);

    int insertSelective(EmployeeRestful record);

    EmployeeRestful selectByPrimaryKey(Integer empId);

    int updateByPrimaryKeySelective(EmployeeRestful record);

    int updateByPrimaryKey(EmployeeRestful record);

    List<EmployeeRestful> listByQueryParam(EmployeeRestful employeeRestful);

    List<EmployeeRestful> list();

}