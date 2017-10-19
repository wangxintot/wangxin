package wx.hope.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wx.hope.domain.entity.User;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "/registerUser")
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    @GetMapping(value = "/getUsers")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping(value = "/getUser/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        return userRepository.findOne(id);
    }
<<<<<<< HEAD

=======
>>>>>>> 9fd914b4c51dc4f96bf167d5e89ae40c43c0de18
}