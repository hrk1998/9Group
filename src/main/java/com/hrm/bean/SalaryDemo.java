package com.hrm.bean;

public class SalaryDemo {
    //员工编号
    private Integer EMP_ID;
    //员工姓名
    private String EMP_NAME;
    //加班费
    private Integer OVERSAL;
    //基本工资
    private Integer BASESAL;
    //奖金
    private Integer REWARD;
    //实发工资
    private Integer SAL;
    //补贴
    private Integer ALLO;
    //扣款
    private Integer CUT;

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

    public Integer getOVERSAL() {
        return OVERSAL;
    }

    public void setOVERSAL(Integer OVERDAL) {
        this.OVERSAL = OVERDAL;
    }

    public Integer getBASESAL() {
        return BASESAL;
    }

    public void setBASESAL(Integer BASESAL) {
        this.BASESAL = BASESAL;
    }

    public Integer getREWARD() {
        return REWARD;
    }

    public void setREWARD(Integer REWARD) {
        this.REWARD = REWARD;
    }

    public Integer getSAL() {
        return SAL;
    }

    public void setSAL(Integer SAL) {
        this.SAL = SAL;
    }

    public Integer getALLO() {
        return ALLO;
    }

    public void setALLO(Integer ALLO) {
        this.ALLO = ALLO;
    }

    public Integer getCUT() {
        return CUT;
    }

    public void setCUT(Integer CUT) {
        this.CUT = CUT;
    }

}
