package com.realstate.usermodule.dao;

import com.realstate.usermodule.entity.Comment;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}