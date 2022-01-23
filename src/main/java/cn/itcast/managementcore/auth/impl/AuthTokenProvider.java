package cn.itcast.managementcore.auth.impl;

import cn.itcast.managementcore.auth.AuthToken;
import cn.itcast.managementcore.utils.UuidUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 类描述：实现生成authToken和refreshToken的值
 */
@Component
public class AuthTokenProvider implements AuthToken {

    /**
     * token过期时间
     */
    @Value("${auth.authTokenExpire}")
    private int authTokenExpire;

    /**
     * refreshToken过期时间
     */
    @Value("${auth.refreshTokenExpire}")
    private int refreshTokenExpire;

    /**
     * 功能描述：生成authToken的值
     *
     * @return 返回authToken的值
     */
    @Override
    public String authToken() {
        return UuidUtils.getUUID();
    }

    /**
     * 功能描述：生成refreshToken的值
     *
     * @return 返回refreshToken的值
     */
    @Override
    public String refreshToken() {
        return UuidUtils.getUUID();
    }

    /**
     * 功能描述：authToken的过期时间
     *
     * @return 返回过期时间
     */
    @Override
    public int authTokenExpire() {
        if(authTokenExpire>0){
            return authTokenExpire;
        }else{
            return 3600;
        }
    }

    /**
     * 功能描述：refreshToken的过期时间
     *
     * @return 返回过期时间
     */
    @Override
    public int refreshTokenExpire() {
        if(refreshTokenExpire>0){
            return refreshTokenExpire;
        }else{
            return 4800;
        }
    }
}
