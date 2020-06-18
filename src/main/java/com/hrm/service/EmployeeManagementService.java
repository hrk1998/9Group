package com.hrm.service;

import com.hrm.bean.EmployeeDemo;
import com.hrm.dto.emp.empDepSearchDTO;

import java.util.List;
import java.util.Map;

public interface EmployeeManagementService {
    /*
    统计性别维度
     */
    List<Map<String,Object>> sexRatio();
    /*
    岗位维度
     */
    List<Map<String,Object>> positionRatio();
    /*
    职称维度
     */
    List<Map<String,Object>> titleRatio();
    /*
    学历维度
     */
    List<Map<String,Object>> eduLvRatio();

}
