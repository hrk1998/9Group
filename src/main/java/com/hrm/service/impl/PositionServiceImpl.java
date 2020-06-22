package com.hrm.service.impl;


import com.hrm.bean.PositionDemo;
import com.hrm.dao.PositionMapperDemo;
import com.hrm.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("PositionService")
@Transactional
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionMapperDemo positionMapperDemo;


    @Override
    public void insertPosition(PositionDemo positionDemo) {
        positionMapperDemo.insertPosition(positionDemo);
    }

    @Override
    public void updatePosition(PositionDemo positionDemo) {
        positionMapperDemo.updatePosition(positionDemo);
    }

    @Override
    public List<PositionDemo> queryAll() {
        return positionMapperDemo.queryAll();
    }

    @Override
    public PositionDemo queryByPosEmpId(Integer EMP_ID) {
        return positionMapperDemo.queryByPosEmpId(EMP_ID);
    }

    @Override
    public PositionDemo queryByPosId(Integer POS_ID) {
        return positionMapperDemo.queryByPosId(POS_ID);
    }

    @Override
    public PositionDemo queryByPosName(String POS_NAME) {
        return positionMapperDemo.queryByPosName(POS_NAME);
    }

    @Override
    public PositionDemo queryByPosFunc(String POS_FUNC) {
        return positionMapperDemo.queryByPosFunc(POS_FUNC);
    }

    @Override
    public int deleteAll() {
        positionMapperDemo.deleteAll();
        return 1;
    }

    @Override
    public int deleteByPosEmpId(Integer EMP_ID) {
        positionMapperDemo.deleteByPosEmpId(EMP_ID);
        return 1;
    }

    @Override
    public int deleteByPosId(Integer POS_ID) {
        positionMapperDemo.deleteByPosId(POS_ID);
        return 1;
    }

    @Override
    public int deleteByPosName(String POS_NAME) {
        positionMapperDemo.deleteByPosName(POS_NAME);
        return 1;
    }

    @Override
    public int deleteByPosFunc(String POS_FUNC) {
        positionMapperDemo.deleteByPosFunc(POS_FUNC);
        return 0;
    }
}
