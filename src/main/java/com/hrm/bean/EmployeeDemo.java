package com.hrm.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class EmployeeDemo {
    //员工编号
    private Integer EMP_ID;
    //员工姓名
    private String EMP_NAME;
    //性别
    private String SEX;
    //地址
    private String ADDRESS;
    //电话号码
    private String TEL;
    //身份证
    private String ID;
    //入职时间
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date HIREDATE;
    //生日
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date BIRTHDAY;
    //职称
    private String TITLE;
    //职位
    private String POSITION;
    //权限
    private Integer PERMISSION;

    public Integer getEMP_ID() {
        return EMP_ID;
    }

    public void setEMP_ID(Integer EMP_ID) {
        this.EMP_ID = EMP_ID;
    }

    public String getEMP_NAME() {
        return EMP_NAME;
    }

    public void setEMP_NAME(String EMP_NAME) {
        this.EMP_NAME = EMP_NAME;
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getTEL() {
        return TEL;
    }

    public void setTEL(String TEL) {
        this.TEL = TEL;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getHIREDATE() {
        return HIREDATE;
    }

    public void setHIREDATE(Date HIREDATE) {
        this.HIREDATE = HIREDATE;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getPOSITION() {
        return POSITION;
    }

    public void setPOSITION(String POSITION) {
        this.POSITION = POSITION;
    }

    public Integer getPERMISSION() {
        return PERMISSION;
    }

    public void setPERMISSION(Integer PERMISSION) {
        this.PERMISSION = PERMISSION;
    }

    public Date getBIRTHDAY() {
        return BIRTHDAY;
    }

    public void setBIRTHDAY(Date BIRTHDAY) {
        this.BIRTHDAY = BIRTHDAY;
    }
}
