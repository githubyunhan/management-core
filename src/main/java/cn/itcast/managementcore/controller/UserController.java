package cn.itcast.managementcore.controller;

import cn.itcast.managementcore.entityVO.AjaxResponse;
import cn.itcast.managementcore.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 类描述：用户的controller
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 功能描述：根据token来获取用户数据
     *
     * @param token token的值
     * @return 返回获取的结果
     */
    @ApiOperation(value = "根据token来获取用户数据")
    @PostMapping("getUserInfo")
    public AjaxResponse getUserInfo(@RequestParam(name = "token") String token) {
        return userService.getUserInfo(token);
    }

    /**
     * 功能描述：实现用户登陆
     * @param loginAccount 用户账号
     * @param loginPassword 用户密码
     * @return 返回登录结果
     */
    @ApiOperation(value = "实现用户登陆")
    @PostMapping("/login")
    public AjaxResponse login(@RequestParam(name = "loginAccount") String loginAccount, @RequestParam(name = "loginPassword") String loginPassword){
        return userService.login(loginAccount, loginPassword);
    }

}
