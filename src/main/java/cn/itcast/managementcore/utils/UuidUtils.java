package cn.itcast.managementcore.utils;

import java.util.UUID;

/**
 * 生成唯一token的工具类
 *
 * 类描述：uuid生成工具类
 */
public class UuidUtils {

    /**
     * 获取主键uuid
     * @return uuid
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * 获取随机的UUID字符串
     * @return uuid
     */
    public static String getRandomUuid() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().toLowerCase();
    }

}
