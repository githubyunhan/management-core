package cn.itcast.managementcore.constant;

import org.springframework.stereotype.Component;

/**
 * 类描述：系统静态实体类
 */
@Component
public class SystemStaticConst {

    /**
     * 系统返回的编码的key
     */
    public static final String RESULT = "code";

    /**
     * 系统返回的消息的key
     */
    public static final String MESSAGE = "message";

    /**
     * 请求操作成功的标志
     */
    public static final int SUCCESS = 200;

    /**
     * 请求操作失败的标志
     */
    public static final int FAIL = 400;


    /**
     * 当前用户没有权限
     */
    public static final int AUTH_FAIL = 300;


}

