package cn.itcast.managementcore.generator.core;

import cn.itcast.managementcore.generator.core.UserOrganizeExample;
import cn.itcast.managementcore.generator.core.UserOrganizeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserOrganizeMapper {
    long countByExample(UserOrganizeExample example);

    int deleteByExample(UserOrganizeExample example);

    int deleteByPrimaryKey(UserOrganizeKey key);

    int insert(UserOrganizeKey record);

    int insertSelective(UserOrganizeKey record);

    List<UserOrganizeKey> selectByExample(UserOrganizeExample example);

    int updateByExampleSelective(@Param("record") UserOrganizeKey record, @Param("example") UserOrganizeExample example);

    int updateByExample(@Param("record") UserOrganizeKey record, @Param("example") UserOrganizeExample example);
}