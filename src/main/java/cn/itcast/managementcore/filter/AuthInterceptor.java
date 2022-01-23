package cn.itcast.managementcore.filter;

import cn.itcast.managementcore.auth.ReleaseUrl;
import cn.itcast.managementcore.constant.SystemStaticConst;
import cn.itcast.managementcore.generator.core.User;
import cn.itcast.managementcore.utils.RedisCache;
import cn.itcast.managementcore.utils.StringUtils;
import cn.itcast.managementcore.utils.WriteUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 类描述：拦截器实现权限的拦截
 */
public class AuthInterceptor implements HandlerInterceptor {

    private Logger log = LoggerFactory.getLogger(AuthInterceptor.class);

    /**
     * 操作redis的实现类
     */
    @Autowired
    private RedisCache redisCache;
    /**
     * 获取放行的权限的接口
     */
    @Autowired
    private ReleaseUrl releaseUrl;


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String token = httpServletRequest.getHeader("x-access-token");
        String actionUrl = httpServletRequest.getServletPath();
        if (SystemStaticConst.ACTION_TYPE_OPTIONS.equals(httpServletRequest.getMethod())) {
            return true;
        }

        /**
         * 判断当前的响应地址是否可以放行
         */
        String releasePath = releaseUrl.getReleaseUrl();
        if (releasePath.indexOf(actionUrl) == -1) {
            if (token == null || "".equals(token) || "null".equals(token)) {
                WriteUtil.write(httpServletResponse, SystemStaticConst.NOT_LOGIN, "用户未登录");
                return false;
            }
            /**
             * 判断当前的用户是否有权限访问当前节点
             */
            log.debug("token:{}", token);
            String powerPath = StringUtils.getObjStr(redisCache.getString(token));
            if ("".equals(powerPath)) {
                WriteUtil.write(httpServletResponse, SystemStaticConst.AUTH_TOKEN_EXPIRE, "token过期");
                return false;
            }
            if (powerPath.indexOf(actionUrl) == -1) {
                WriteUtil.write(httpServletResponse, SystemStaticConst.AUTH_FAIL, "用户无权限，请联系系统管理员");
                return false;
            }
            /**
             * 根据token来获取当前登录的用户的信息
             */
            User user = redisCache.getObject(token + "_USER", User.class);
            if (user == null) {
                WriteUtil.write(httpServletResponse, SystemStaticConst.NOT_LOGIN, "用户未登录");
                return false;
            }
        }
        return true;
    }
}
