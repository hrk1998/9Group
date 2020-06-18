package com.hrm.dao;


import java.util.List;
import java.util.Map;

public interface EmployeeManagementMapper {
    //获取性别
    List<Map<String,Object>> getSexRatio();
    //获取岗位比例
    List<Map<String,Object>> getPositionRatio();
    //获取职称维度
    List<Map<String,Object>> getTitleRatio();
    //获取学历维度
    List<Map<String,Object>> getEduLvRatio();
}
