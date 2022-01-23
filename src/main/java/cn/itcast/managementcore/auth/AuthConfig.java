package cn.itcast.managementcore.auth;

/**
 * 用户鉴权的相关配置
 *
 * 类描述：鉴权的配置接口类
 */
public interface AuthConfig {

    /**
     * 功能描述：获取当前的登陆是否允许单点登陆
     * @return
     */
    boolean isSingleLanding();
}
