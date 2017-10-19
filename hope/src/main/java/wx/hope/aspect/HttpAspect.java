package wx.hope.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HttpAspect {

    @Before("execution(public * wx.hope.controller.UserController.*(..))")
    public void log(){
        System.out.println(111111);
    }

    @After("execution(public * wx.hope.controller.UserController.*(..))")
    public void doAfter(){
        System.out.println(2222222);
    }
}
