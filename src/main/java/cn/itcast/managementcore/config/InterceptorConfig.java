package cn.itcast.managementcore.config;

import cn.itcast.managementcore.filter.AuthInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 类描述：设置拦截器
 */
@Component
public class InterceptorConfig implements WebMvcConfigurer {

    /**
     * 初始化鉴权拦截器
     */
    private AuthInterceptor authInterceptor = new AuthInterceptor();

    /**
     * 注入权限拦截器bean
     */
    @Bean
    AuthInterceptor authInterceptor(){
        return  authInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 先加的拦截器先执行
        registry.addInterceptor(authInterceptor()).addPathPatterns("/**");
    }


}
