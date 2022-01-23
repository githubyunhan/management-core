package cn.itcast.managementcore.generator.core;

import cn.itcast.managementcore.generator.core.Tree;
import cn.itcast.managementcore.generator.core.TreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TreeMapper {
    long countByExample(TreeExample example);

    int deleteByExample(TreeExample example);

    int deleteByPrimaryKey(Integer treeId);

    int insert(Tree record);

    int insertSelective(Tree record);

    List<Tree> selectByExample(TreeExample example);

    Tree selectByPrimaryKey(Integer treeId);

    int updateByExampleSelective(@Param("record") Tree record, @Param("example") TreeExample example);

    int updateByExample(@Param("record") Tree record, @Param("example") TreeExample example);

    int updateByPrimaryKeySelective(Tree record);

    int updateByPrimaryKey(Tree record);


    /*自定义*/
    /**
     * 功能描述：根据用户登录的ID来获取权限数据的集合
     * @param userId 用户ID
     * @return 返回数据集合
     */
    List<Tree> getLoginUserPowerPath(@Param("userId") String userId);
}