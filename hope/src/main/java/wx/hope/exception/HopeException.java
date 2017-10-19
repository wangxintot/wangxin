package wx.hope.exception;

/**
 * 继承runtimeException才会事务回滚，Exception则不会回滚
 * Created by wangxin on 2017/10/19.
 */

public class HopeException extends RuntimeException {

    private Integer code;

    public HopeException(Integer code,String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
