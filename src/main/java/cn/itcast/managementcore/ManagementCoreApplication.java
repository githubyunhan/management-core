package cn.itcast.managementcore;

import cn.itcast.managementcore.utils.RedisCache;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * 类描述：主入口类
 */
@SpringBootApplication
@MapperScan(basePackages = {"cn.itcast.managementcore.generator"})/*扫描路径*/
public class ManagementCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagementCoreApplication.class, args);
    }

    @Bean
    RedisCache redisCache(){
        return new RedisCache();
    }
}
