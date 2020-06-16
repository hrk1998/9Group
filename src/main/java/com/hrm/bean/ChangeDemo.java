package com.hrm.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/*
对员工调动信息表进行操作
 */
public class ChangeDemo {
    //员工编号
    private Integer EMP_ID;
    //员工姓名
    private String EMP_NAME;
    //调动编号
    private Integer CHANGE_ID;
    //日期
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date CHANGE_D;
    //调动原因
    private String REASON;

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

    public Integer getCHANGE_ID() {
        return CHANGE_ID;
    }

    public void setCHANGE_ID(Integer CHANGE_ID) {
        this.CHANGE_ID = CHANGE_ID;
    }

    public Date getCHANGE_D() {
        return CHANGE_D;
    }

    public void setCHANGE_D(Date CHANGE_D) {
        this.CHANGE_D = CHANGE_D;
    }

    public String getREASON() {
        return REASON;
    }

    public void setREASON(String REASON) {
        this.REASON = REASON;
    }
}
