package com.hrm.service;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hrm.bean.RecruitDemo;

import java.util.Date;
import java.util.List;

public interface RecruitService {

    //插入
    void insertRecruit(RecruitDemo recruitDemo);

    //修改
    void updateRecruit(RecruitDemo recruitDemo);
    /*
    搜索
     */
    List<RecruitDemo> queryAll();
    //招聘编号
    RecruitDemo queryByRecrId(Integer RECR_ID);
    //发布人
    List<RecruitDemo> queryByIssuer(String ISSUER);
    //招聘职位
    List<RecruitDemo> queryByRecrPos(String RECR_POS);
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    List<RecruitDemo> queryByRecrDay(Date RECR_DAY);

    /*
    删除
     */
    int deleteAll();
    //招聘编号
    int deleteByRecrId(Integer RECR_ID);
    //发布人
    int deleteByIssuer(String ISSUER);
    //招聘职位
    int deleteByRecrPos(String RECR_POS);
    //发布时间
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    int deleteByRecrDay(Date RECR_DAY);

}
