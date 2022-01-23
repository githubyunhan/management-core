package cn.itcast.managementcore.auth.impl;

import cn.itcast.managementcore.auth.AuthConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 类描述：鉴权的配置接口类的实现
 */
@Component
public class AuthConfigProvider implements AuthConfig {

    @Value("${auth.singleLanding}")
    private boolean singleLanding;

    @Override
    public boolean isSingleLanding() {
        return singleLanding;
    }
}
