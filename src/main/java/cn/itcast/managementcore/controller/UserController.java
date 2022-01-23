package cn.itcast.managementcore.controller;

import cn.itcast.managementcore.constant.SystemStaticConst;
import cn.itcast.managementcore.entityVO.AjaxResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 类描述：用户的controller
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 功能描述：模拟实现用户登录
     * @param loginAccount 用户账号
     * @param loginPassword 用户密码
     * @return 返回登录结果
     */
    @ApiOperation(value = "实现用户登陆")
    @PostMapping("/login")
    public AjaxResponse login(@RequestParam(name = "loginAccount") String loginAccount, @RequestParam(name = "loginPassword") String loginPassword){
        Map<String,Object> result = new HashMap<>(1);
        result.put("token","token123");
        return new AjaxResponse(SystemStaticConst.SUCCESS, "用户登陆成功",result);
    }

}
