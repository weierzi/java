package com.accp.mapper;

import com.accp.domain.Zz;
import com.accp.domain.ZzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZzMapper {
    int countByExample(ZzExample example);

    int deleteByExample(ZzExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Zz record);

    int insertSelective(Zz record);

    List<Zz> selectByExample(ZzExample example);

    Zz selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Zz record, @Param("example") ZzExample example);

    int updateByExample(@Param("record") Zz record, @Param("example") ZzExample example);

    int updateByPrimaryKeySelective(Zz record);

    int updateByPrimaryKey(Zz record);
}