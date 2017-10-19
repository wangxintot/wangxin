package wx.hope.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import wx.hope.domain.entity.User;

/**
 * Created by wangxin on 2017/10/17.
 */
public interface UserRepository extends JpaRepository<User,Integer> {

}
