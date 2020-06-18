package com.hrm.controller.main;

import com.alibaba.fastjson.JSONObject;
import com.hrm.bean.EmployeeDemo;
import com.hrm.service.EmployeeManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@RestController
@RequestMapping(value = "/demo")
public class EmployeeManagementController {
    @Autowired
    private EmployeeManagementService employeeServiceDemo;

    @RequestMapping(value = "/test")
    public JSONObject test(){

        JSONObject jsonObject = new JSONObject();

        EmployeeDemo employeeDemo = new EmployeeDemo();
        employeeDemo.setADDRESS("zhuzhi");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            employeeDemo.setBIRTHDAY(sdf.parse("2020-06-17"));
            employeeDemo.setHIREDATE(sdf.parse("2020-06-17"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        employeeDemo.setEDU_LV("jiaoyudengji");
        employeeDemo.setEMP_ID(1);
        employeeDemo.setEMP_NAME("yuangongxingming");
        employeeDemo.setID("shenfenzheng");
        employeeDemo.setINS_ID(123);
        employeeDemo.setNATIVE("jiguan");
        employeeDemo.setNATTION("minzu");
        employeeDemo.setPERMISSION(1);
        employeeDemo.setPOSITION("bumen");
        employeeDemo.setSEX("xingbie");
        employeeDemo.setTEL("dianhua");
        employeeDemo.setTITLE("zhichen");
        System.out.println(employeeDemo.getEMP_ID());

//        employeeServiceDemo.insertEmp(employeeDemo);
        jsonObject.put("title", "测试成功" + employeeDemo.getEMP_ID());
        return jsonObject;
    }
}
