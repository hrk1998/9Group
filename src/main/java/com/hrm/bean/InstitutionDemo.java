package com.hrm.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/*
对机构表进行操作
 */
public class InstitutionDemo {
    //机构代码
    private Integer INS_ID;
    //机构名称
    private String INS_NAME;
    //机构规格
    private String INS_NOMES;
    //父机构编码
    private String FINS_ID;

    public Integer getINS_ID() {
        return INS_ID;
    }

    public void setINS_ID(Integer INS_ID) {
        this.INS_ID = INS_ID;
    }

    public String getINS_NAME() {
        return INS_NAME;
    }

    public void setINS_NAME(String INS_NAME) {
        this.INS_NAME = INS_NAME;
    }

    public String getINS_NOMES() {
        return INS_NOMES;
    }

    public void setINS_NOMES(String INS_NOMES) {
        this.INS_NOMES = INS_NOMES;
    }

    public String getFINS_ID() {
        return FINS_ID;
    }

    public void setFINS_ID(String FINS_ID) {
        this.FINS_ID = FINS_ID;
    }
}
