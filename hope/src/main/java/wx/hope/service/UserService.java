package wx.hope.service;

import org.springframework.stereotype.Service;
import wx.hope.domain.entity.User;

public interface UserService {

    String login(User user);

    User registerUser(User user);
}

