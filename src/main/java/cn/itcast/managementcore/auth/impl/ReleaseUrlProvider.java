package cn.itcast.managementcore.auth.impl;

import cn.itcast.managementcore.auth.ReleaseUrl;
import cn.itcast.managementcore.constant.SystemStaticConst;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 类描述：放行的用户权限的地址
 */
@Component
public class ReleaseUrlProvider implements ReleaseUrl {

    /**
     * 此处的配置信息从配置文件中获取
     */
    @Value("${auth.releaseUrl}")
    private String releaseUrl;

    /**
     * 功能描述：获取放行的权限的数据
     * @return 返回放行的权限的数据
     */
    @Override
    public String getReleaseUrl() {
        if(releaseUrl==null){
            releaseUrl = "";
        }
        releaseUrl = releaseUrl + ":" + SystemStaticConst.LOGIN_URL + ":" + SystemStaticConst.USER_INFO_URL  + ":" + SystemStaticConst.REFRESH_URL;
        return releaseUrl;
    }
}