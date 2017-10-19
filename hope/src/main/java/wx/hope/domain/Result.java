package wx.hope.domain;

/**
 * http请求返回最外层对象
 * Created by wangxin on 2017/10/19.
 */
public class Result<T> {
    //错误吗
    private Integer code;
    //信息
    private String msg;
    //具体对象
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
