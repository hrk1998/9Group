package com.hrm.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/*
对员工信息表进行操作
 */
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
    //教育程度
    private String EDU_LV;
    //民族
    private String NATTION;
    //籍贯
    private String NATIVE;
    //职位
    private String POSITION;
    //机构编号
    private Integer INS_ID;
    //权限
    private Integer PERMISSION;
    //计算性别比例
    private Integer SexCount;
    //计算岗位比例
    private Integer PositionCount;
    //计算职称比例
    private Integer TitleCount;
    //计算学历比例
    private Integer EduLvCount;

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

    public String getEDU_LV() {
        return EDU_LV;
    }

    public void setEDU_LV(String EDU_LV) {
        this.EDU_LV = EDU_LV;
    }

    public String getNATTION() {
        return NATTION;
    }

    public void setNATTION(String NATTION) {
        this.NATTION = NATTION;
    }

    public String getNATIVE() {
        return NATIVE;
    }

    public void setNATIVE(String NATIVE) {
        this.NATIVE = NATIVE;
    }

    public Integer getINS_ID() {
        return INS_ID;
    }

    public void setINS_ID(Integer INS_ID) {
        this.INS_ID = INS_ID;
    }

    public Integer getSexCount() {
        return SexCount;
    }

    public void setSexCount(Integer sexCount) {
        SexCount = sexCount;
    }

    public Integer getPositionCount() {
        return PositionCount;
    }

    public void setPositionCount(Integer positionCount) {
        PositionCount = positionCount;
    }

    public Integer getTitleCount() {
        return TitleCount;
    }

    public void setTitleCount(Integer titleCount) {
        TitleCount = titleCount;
    }

    public Integer getEduLvCount() {
        return EduLvCount;
    }

    public void setEduLvCount(Integer eduLvCount) {
        EduLvCount = eduLvCount;
    }
}
