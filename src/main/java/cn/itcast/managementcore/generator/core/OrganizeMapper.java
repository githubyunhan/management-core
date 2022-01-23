package cn.itcast.managementcore.generator.core;

import cn.itcast.managementcore.generator.core.Organize;
import cn.itcast.managementcore.generator.core.OrganizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizeMapper {
    long countByExample(OrganizeExample example);

    int deleteByExample(OrganizeExample example);

    int deleteByPrimaryKey(Integer orgId);

    int insert(Organize record);

    int insertSelective(Organize record);

    List<Organize> selectByExample(OrganizeExample example);

    Organize selectByPrimaryKey(Integer orgId);

    int updateByExampleSelective(@Param("record") Organize record, @Param("example") OrganizeExample example);

    int updateByExample(@Param("record") Organize record, @Param("example") OrganizeExample example);

    int updateByPrimaryKeySelective(Organize record);

    int updateByPrimaryKey(Organize record);
}