package cn.itcast.managementcore.service;

import cn.itcast.managementcore.auth.Auth;
import cn.itcast.managementcore.constant.SystemStaticConst;
import cn.itcast.managementcore.entityVO.AjaxResponse;
import cn.itcast.managementcore.generator.core.Tree;
import cn.itcast.managementcore.generator.core.TreeMapper;
import cn.itcast.managementcore.generator.core.User;
import cn.itcast.managementcore.generator.core.UserMapper;
import cn.itcast.managementcore.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = {IllegalArgumentException.class})
public class UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private TreeMapper treeMapper;

    /**
     * 鉴权的实现
     */
    @Autowired
    private Auth authProvider;

    /**
     * 功能描述：实现用户登陆
     *
     * @param loginAccount  用户账号
     * @param loginPassword 用户密码
     * @return 返回登陆结果
     */
    public AjaxResponse login(String loginAccount, String loginPassword) {
        return authProvider.login(loginAccount, loginPassword);
    }

    /**
     * 功能描述：根据token来获取用户数据
     *
     * @param token token的值
     * @return 返回获取的结果
     */
    public AjaxResponse getUserInfo(String token) {
        User user = userMapper.getUserInfo(token);
        if (user == null) {
            return new AjaxResponse(SystemStaticConst.FAIL, "获取账号信息错误");
        }
        user.setLoginPassword(null);
        List<Tree> treeList = treeMapper.getLoginUserTree(user.getUserId());
        String[] access = new String[treeList.size()];
        for (int i = 0; i < treeList.size(); i++) {
            access[i] = treeList.get(i).getTreeCode();
        }
        Map<String, Object> result = JsonUtils.objToMap(user);
        result.put("access", access);
        return new AjaxResponse(SystemStaticConst.SUCCESS, "登陆成功", result);
    }

}
