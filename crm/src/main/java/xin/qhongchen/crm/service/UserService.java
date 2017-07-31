package xin.qhongchen.crm.service;

import org.springframework.transaction.annotation.Transactional;
import xin.qhongchen.crm.entity.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/20
 * Time:   11:18
 */
@Transactional
public interface UserService {

    boolean login(User user);
    User getByUserName(String name);
    void updateUser(User user);
    List<User> getByPower(Integer power);
}
