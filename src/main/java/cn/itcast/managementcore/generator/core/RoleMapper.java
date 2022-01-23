package cn.itcast.managementcore.generator.core;

import cn.itcast.managementcore.generator.core.Role;
import cn.itcast.managementcore.generator.core.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(String roleId);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(String roleId);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);


    /*自定义*/
    /**
     * 功能描述：根据用户ID来获取该用户的相应的绑定的数据
     * @param userId 用户ID
     * @return 返回角色的集合
     */
    List<Role> getUserRoleListByUserId(@Param("userId") String userId);
}