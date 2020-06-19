package com.hrm.service;

import com.hrm.bean.EmployeeRestful;

import java.util.List;

public interface EmployeeRestfulService {

    List<EmployeeRestful> list();

    void update(EmployeeRestful employeeRestful);

    List<EmployeeRestful> listByQueryParam(EmployeeRestful employeeRestful);

    void delete(Integer empId);

    void insert(EmployeeRestful employeeRestful);
}
