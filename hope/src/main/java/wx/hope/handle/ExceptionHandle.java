package wx.hope.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import wx.hope.domain.Result;
import wx.hope.exception.HopeException;
import wx.hope.utils.ResultUtil;

/**
 * Created by wangxin on 2017/10/19.
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = HopeException.class)
    @ResponseBody
    public Result handle(Exception e){
        if (e instanceof HopeException) {
            HopeException hopeException = (HopeException)e;
            return ResultUtil.error(hopeException.getCode(),hopeException.getMessage());
        }
        logger.error("System Exception",e);
        return ResultUtil.error(-1,"UnKnow error");
    }
}

