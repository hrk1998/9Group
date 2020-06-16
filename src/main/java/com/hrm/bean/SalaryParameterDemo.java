package com.hrm.bean;

public class SalaryParameterDemo {
    //员工编号
    private Integer EMP_ID;
    //公积金缓存系数
    private Integer DBPF;
    //保险激存系数
    private Integer IDB;
    //所得税系数
    private Integer ITB;

    public Integer getEMP_ID() {
        return EMP_ID;
    }

    public void setEMP_ID(Integer EMP_ID) {
        this.EMP_ID = EMP_ID;
    }

    public Integer getDBPF() {
        return DBPF;
    }

    public void setDBPF(Integer DBPF) {
        this.DBPF = DBPF;
    }

    public Integer getIDB() {
        return IDB;
    }

    public void setIDB(Integer IDB) {
        this.IDB = IDB;
    }

    public Integer getITB() {
        return ITB;
    }

    public void setITB(Integer ITB) {
        this.ITB = ITB;
    }
}
