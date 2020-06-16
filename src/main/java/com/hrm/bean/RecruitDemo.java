package com.hrm.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/*
对招聘表进行操作
 */
public class RecruitDemo {
    //招聘编号
    private Integer RECR_ID;
    //发布人
    private String ISSUER;
    //招聘职位
    private String RECR_POS;
    //招聘人数
    private Integer RECP_NUM;
    //发布时间
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date RECR_DAY;
    //简介
    private String ITRO;

    public Integer getRECR_ID() {
        return RECR_ID;
    }

    public void setRECR_ID(Integer RECR_ID) {
        this.RECR_ID = RECR_ID;
    }

    public String getISSUER() {
        return ISSUER;
    }

    public void setISSUER(String ISSUER) {
        this.ISSUER = ISSUER;
    }

    public String getRECR_POS() {
        return RECR_POS;
    }

    public void setRECR_POS(String RECR_POS) {
        this.RECR_POS = RECR_POS;
    }

    public Integer getRECP_NUM() {
        return RECP_NUM;
    }

    public void setRECP_NUM(Integer RECP_NUM) {
        this.RECP_NUM = RECP_NUM;
    }

    public Date getRECR_DAY() {
        return RECR_DAY;
    }

    public void setRECR_DAY(Date RECR_DAY) {
        this.RECR_DAY = RECR_DAY;
    }

    public String getITRO() {
        return ITRO;
    }

    public void setITRO(String ITRO) {
        this.ITRO = ITRO;
    }
}
