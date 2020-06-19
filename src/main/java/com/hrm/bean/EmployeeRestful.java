package com.hrm.bean;

import java.util.Date;

public class EmployeeRestful {
    private Integer empId;

    private String empName;

    private String id;

    private Integer permissson;

    private Date birthday;

    private String sex;

    private String nattion;

    private String natives;

    private String title;

    private String position;

    private Date hiredate;

    private String eduLv;

    private String address;

    private String tel;

    private Integer insId;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getPermissson() {
        return permissson;
    }

    public void setPermissson(Integer permissson) {
        this.permissson = permissson;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getNattion() {
        return nattion;
    }

    public void setNattion(String nattion) {
        this.nattion = nattion == null ? null : nattion.trim();
    }

    public String getNatives() {
        return natives;
    }

    public void setNatives(String natives) {
        this.natives = natives == null ? null : natives.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public String getEduLv() {
        return eduLv;
    }

    public void setEduLv(String eduLv) {
        this.eduLv = eduLv == null ? null : eduLv.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getInsId() {
        return insId;
    }

    public void setInsId(Integer insId) {
        this.insId = insId;
    }
}