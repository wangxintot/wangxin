package wx.hope.enums;

/**
 * Created by wangxin on 2017/10/19.
 */
public enum ResultEnum {
    UNKONW_ERROR(-1,"unknow error"),
    SUCCESS(0,"success"),
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
