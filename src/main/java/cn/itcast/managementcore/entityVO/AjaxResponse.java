package cn.itcast.managementcore.entityVO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class AjaxResponse {

    private int code;
    private String message;
    private Object data;

    public AjaxResponse() {
        super();
    }

    public AjaxResponse(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

    public AjaxResponse(Integer code, String message, Object data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public static AjaxResponse success() {
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setCode(200);
        resultBean.setMessage("success");
        return resultBean;
    }

    public static AjaxResponse success(Object data) {
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setCode(200);
        resultBean.setMessage("success");
        resultBean.setData(data);
        return resultBean;
    }
}

