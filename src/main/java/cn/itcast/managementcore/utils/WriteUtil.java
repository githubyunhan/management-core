package cn.itcast.managementcore.utils;

import cn.itcast.managementcore.entityVO.AjaxResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 类描述：
 */
public class WriteUtil {

    static Logger log = LoggerFactory.getLogger(WriteUtil.class);

    /**
     * 功能描述：异常信息处理
     *
     * @param httpServletResponse
     * @param failCode            失败码
     * @param message                 失败原因
     */
    public static void write(HttpServletResponse httpServletResponse, int failCode, String message) {
        PrintWriter writer = null;
        try {
            /**
             * 设置允许跨域请求和返回页面的编码
             */
            httpServletResponse.setCharacterEncoding("UTF-8");
            httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
            httpServletResponse.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
            writer = httpServletResponse.getWriter();
            String result = JsonUtils.objToJson(new AjaxResponse(failCode, message));
            writer.print(result);
        } catch (IOException e) {
            log.error("response error", e);
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

}
