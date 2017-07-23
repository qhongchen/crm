package xin.qhongchen.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.qhongchen.crm.entity.User;
import xin.qhongchen.crm.service.UserService;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/20
 * Time:   11:30
 */
@RestController
public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public User login(User user){

        boolean logined = userService.login(user);

        return logined ? userService.getByUserName(user.getUserName()) : null;
    }

}
