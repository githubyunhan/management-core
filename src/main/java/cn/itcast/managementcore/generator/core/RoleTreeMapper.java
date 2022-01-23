package cn.itcast.managementcore.generator.core;

import cn.itcast.managementcore.generator.core.RoleTreeExample;
import cn.itcast.managementcore.generator.core.RoleTreeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleTreeMapper {
    long countByExample(RoleTreeExample example);

    int deleteByExample(RoleTreeExample example);

    int deleteByPrimaryKey(RoleTreeKey key);

    int insert(RoleTreeKey record);

    int insertSelective(RoleTreeKey record);

    List<RoleTreeKey> selectByExample(RoleTreeExample example);

    int updateByExampleSelective(@Param("record") RoleTreeKey record, @Param("example") RoleTreeExample example);

    int updateByExample(@Param("record") RoleTreeKey record, @Param("example") RoleTreeExample example);
}