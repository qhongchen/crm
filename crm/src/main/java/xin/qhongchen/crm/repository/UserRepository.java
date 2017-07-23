package xin.qhongchen.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xin.qhongchen.crm.entity.User;


/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/20
 * Time:   11:17
 */
public interface UserRepository extends JpaRepository<User,Integer>{

    User findByUserName(String userName);
}
