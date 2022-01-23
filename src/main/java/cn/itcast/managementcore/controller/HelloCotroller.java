package cn.itcast.managementcore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCotroller {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

}
