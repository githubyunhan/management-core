package cn.itcast.managementcore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"cn.itcast.managementcore.generator"})/*扫描路径*/
public class ManagementCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagementCoreApplication.class, args);
    }

}
