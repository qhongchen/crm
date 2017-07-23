package xin.qhongchen.crm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.qhongchen.crm.entity.User;
import xin.qhongchen.crm.repository.UserRepository;
import xin.qhongchen.crm.service.UserService;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/20
 * Time:   11:19
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean login(User user) {

        if(null != user){

            User dbUser = userRepository.findByUserName(user.getUserName());

            if (null != dbUser){
                if (user.getUserPwd().equals(dbUser.getUserPwd()))
                    return true;
            }

        }
        return false;
    }

    @Override
    public User getByUserName(String name) {

        return userRepository.findByUserName(name);
    }

    @Override
    public void updateUser(User user) {

        userRepository.save(user);
    }
}
