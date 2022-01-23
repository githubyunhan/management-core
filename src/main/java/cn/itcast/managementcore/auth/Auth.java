package cn.itcast.managementcore.auth;

import cn.itcast.managementcore.entityVO.AjaxResponse;

/**
 * 用户鉴权
 *
 * 类描述：鉴权的接口类
 */
public interface Auth {

    /**
     * 功能描述：实现用户登陆
     * @param loginAccount 用户账号
     * @param loginPassword 用户密码
     * @return 返回登陆结果
     */
    AjaxResponse login(String loginAccount, String loginPassword);

    /**
     * 功能描述：实现重新刷新token
     * @param refreshToken token的值
     * @return 返回刷新结果
     */
    AjaxResponse refreshToken(String refreshToken);
}
