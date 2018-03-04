package wx.hope.service;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wx.hope.controller.UserRepository;
import wx.hope.domain.entity.User;

/**
 * Created by wangxin on 2018/3/4.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public String login(User user) {
        return null;
    }

    @Override
    public User registerUser(User user) {
        String password = DigestUtils.md5Hex(user.getPassword());
        user.setPassword(password);
        return userRepository.save(user);
    }
}
