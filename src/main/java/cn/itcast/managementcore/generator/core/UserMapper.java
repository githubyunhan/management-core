package cn.itcast.managementcore.generator.core;

import cn.itcast.managementcore.generator.core.User;
import cn.itcast.managementcore.generator.core.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


    /*自定义*/
    /**
     * 功能描述：根据token来获取用户数据
     * @param token token的值
     * @return 返回获取的结果
     */
    User getUserInfo(@Param("token")String token);

    /**
     * 功能描述：实现用户的登陆
     * @param loginAccount 用户账号
     * @param loginPassword 用户密码
     * @return 返回登陆结果
     */
    User login(@Param("loginAccount")String loginAccount, @Param("loginPassword")String loginPassword);
}