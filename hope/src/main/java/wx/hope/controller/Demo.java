package wx.hope.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @RequestMapping(value="/demo",method = RequestMethod.GET)
    public String say(){
        return "hello";
    }
}
