package com.realstate.usermodule.dao;

import com.realstate.usermodule.entity.HouseMsg;

public interface HouseMsgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HouseMsg record);

    int insertSelective(HouseMsg record);

    HouseMsg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HouseMsg record);

    int updateByPrimaryKey(HouseMsg record);
}