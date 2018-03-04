package wx.hope.controller;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wx.hope.domain.entity.User;
import wx.hope.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/registerUser")
    public User registerUser(User user) {
        return userService.registerUser(user);
    }

    @PostMapping(value = "/login")
    public String login(User user){

//      userRepository.
        return null;
    }

//    @GetMapping(value = "/getUsers")
//    public List<User> getUsers() {
//        return userRepository.findAll();
//    }

//    @GetMapping(value = "/getUser/{id}")
//    public User getUser(@PathVariable("id") Integer id) {
//        return userRepository.findOne(id);
//    }

}