package com.hrm.service;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hrm.bean.ChangeDemo;
import com.hrm.bean.InstitutionDemo;

import java.util.Date;
import java.util.List;

public interface InstitutionManagementService {


    void insertInstitution(InstitutionDemo institutionDemo);

    void updateInstitution(InstitutionDemo institutionDemo);

    List<InstitutionDemo> queryAll();

    InstitutionDemo queryByInsId(Integer INS_ID);

    InstitutionDemo queryByInsName(String INS_NAME);

    List<InstitutionDemo> queryByInsNomes(String INS_NOMES);

    List<InstitutionDemo> queryByFinsId(String FINS_ID);



    int deleteAll();

    int deleteByInsId(Integer INS_ID);

    int deleteByInsName(String INS_NAME);

    int deleteByInsNomes(String INS_NOMES);

    int deleteByFinsId(String FINS_ID);
}
