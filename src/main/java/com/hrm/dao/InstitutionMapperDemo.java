package com.hrm.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hrm.bean.ChangeDemo;
import com.hrm.bean.InstitutionDemo;

import java.util.Date;
import java.util.List;

public interface InstitutionMapperDemo {
    //插入
    void insertInstitution(InstitutionDemo institutionDemo);

    //修改
    void updateInstitution(InstitutionDemo institutionDemo);

    /*
    查找数据
     */
    //查询所有
    List<InstitutionDemo> queryAll();
    //机构代码
    InstitutionDemo queryByInsId(Integer INS_ID);
    //机构名称
    InstitutionDemo queryByInsName(String INS_NAME);
    //机构规格
    List<InstitutionDemo> queryByInsNomes(String INS_NOMES);
    //父机构编码
    List<InstitutionDemo> queryByFinsId(String FINS_ID);


    /*
    删除数据
     */
    //删除所有
    int deleteAll();
    //机构代码
    int deleteByInsId(Integer INS_ID);
    //机构名称
    int deleteByInsName(String INS_NAME);
    //机构规格
    int deleteByInsNomes(String INS_NOMES);
    //父机构编码
    int deleteByFinsId(String FINS_ID);
}
