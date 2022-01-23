package cn.itcast.managementcore.auth;

/**
 * 鉴权的放行方法
 *
 * 类描述：放行的用户权限的地址
 */
public interface ReleaseUrl {

    /**
     * 功能描述：获取放行的权限的数据
     * @return 返回放行的权限的数据
     */
    String getReleaseUrl();

}
