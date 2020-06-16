package com.hrm.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class PositionDemo {
    //员工编号
    private Integer EMP_ID;
    //职位编号
    private Integer POS_ID;
    //职位名称
    private String POS_NAME;
    //职位职能
    private String POS_FUNC;

    public Integer getEMP_ID() {
        return EMP_ID;
    }

    public void setEMP_ID(Integer EMP_ID) {
        this.EMP_ID = EMP_ID;
    }

    public Integer getPOS_ID() {
        return POS_ID;
    }

    public void setPOS_ID(Integer POS_ID) {
        this.POS_ID = POS_ID;
    }

    public String getPOS_NAME() {
        return POS_NAME;
    }

    public void setPOS_NAME(String POS_NAME) {
        this.POS_NAME = POS_NAME;
    }

    public String getPOS_FUNC() {
        return POS_FUNC;
    }

    public void setPOS_FUNC(String POS_FUNC) {
        this.POS_FUNC = POS_FUNC;
    }

}
