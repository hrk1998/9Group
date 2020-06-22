package com.hrm.service.impl;

import com.hrm.bean.InstitutionDemo;
import com.hrm.dao.InstitutionMapperDemo;
import com.hrm.service.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("InstitutionService")
@Transactional
public class InstitutionServiceImpl implements InstitutionService {

    @Autowired
    private InstitutionMapperDemo institutionMapperDemo;
    @Override
    public void insertInstitution(InstitutionDemo institutionDemo) {
        institutionMapperDemo.insertInstitution(institutionDemo);
    }

    @Override
    public void updateInstitution(InstitutionDemo institutionDemo) {
        institutionMapperDemo.updateInstitution(institutionDemo);
    }

    @Override
    public List<InstitutionDemo> queryAll() {
        return institutionMapperDemo.queryAll();
    }

    @Override
    public InstitutionDemo queryByInsId(Integer INS_ID) {
        return institutionMapperDemo.queryByInsId(INS_ID);
    }

    @Override
    public InstitutionDemo queryByInsName(String INS_NAME) {
        return institutionMapperDemo.queryByInsName(INS_NAME);
    }

    @Override
    public List<InstitutionDemo> queryByInsNomes(String INS_NOMES) {
        return institutionMapperDemo.queryByInsNomes(INS_NOMES);
    }

    @Override
    public List<InstitutionDemo> queryByFinsId(String FINS_ID) {
        return institutionMapperDemo.queryByFinsId(FINS_ID);
    }

    @Override
    public int deleteAll() {
        institutionMapperDemo.deleteAll();
        return 1;
    }

    @Override
    public int deleteByInsId(Integer INS_ID) {
        institutionMapperDemo.deleteByInsId(INS_ID);
        return 1;
    }

    @Override
    public int deleteByInsName(String INS_NAME) {
        institutionMapperDemo.deleteByInsName(INS_NAME);
        return 1;
    }

    @Override
    public int deleteByInsNomes(String INS_NOMES) {
        institutionMapperDemo.deleteByInsNomes(INS_NOMES);
        return 1;
    }

    @Override
    public int deleteByFinsId(String FINS_ID) {
        institutionMapperDemo.deleteByFinsId(FINS_ID);
        return 1;
    }
}
