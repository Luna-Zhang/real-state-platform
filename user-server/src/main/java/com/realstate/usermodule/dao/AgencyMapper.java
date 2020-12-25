package com.realstate.usermodule.dao;

import com.realstate.usermodule.entity.Agency;

public interface AgencyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Agency record);

    int insertSelective(Agency record);

    Agency selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Agency record);

    int updateByPrimaryKey(Agency record);
}