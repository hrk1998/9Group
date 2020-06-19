package com.hrm.service.impl;

import com.hrm.bean.RecruitDemo;
import com.hrm.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service("RecruitService")
@Transactional
public class RecruitServiceImpl implements RecruitService {
    @Autowired
    RecruitService recruitService;

    @Override
    public void insertRecruit(RecruitDemo recruitDemo) {
        recruitService.insertRecruit(recruitDemo);
    }

    @Override
    public void updateRecruit(RecruitDemo recruitDemo) {
        recruitService.updateRecruit(recruitDemo);
    }

    @Override
    public List<RecruitDemo> queryAll() {
        return recruitService.queryAll();
    }

    @Override
    public RecruitDemo queryByRecrId(Integer RECR_ID) {
        return recruitService.queryByRecrId(RECR_ID);
    }

    @Override
    public List<RecruitDemo> queryByIssuer(String ISSUER) {
        return recruitService.queryByIssuer(ISSUER);
    }

    @Override
    public List<RecruitDemo> queryByRecrPos(String RECR_POS) {
        return recruitService.queryByRecrPos(RECR_POS);
    }

    @Override
    public List<RecruitDemo> queryByRecrDay(Date RECR_DAY) {
        return recruitService.queryByRecrDay(RECR_DAY);
    }

    @Override
    public int deleteAll() {
        recruitService.deleteAll();
        return 1;
    }

    @Override
    public int deleteByRecrId(Integer RECR_ID) {
        recruitService.deleteByRecrId(RECR_ID);
        return 1;
    }

    @Override
    public int deleteByIssuer(String ISSUER) {
        recruitService.deleteByIssuer(ISSUER);
        return 1;
    }

    @Override
    public int deleteByRecrPos(String RECR_POS) {
        recruitService.deleteByRecrPos(RECR_POS);
        return 1;
    }

    @Override
    public int deleteByRecrDay(Date RECR_DAY) {
        recruitService.queryByRecrDay(RECR_DAY);
        return 1;
    }
}
