package xin.qhongchen.crm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import xin.qhongchen.crm.entity.SalesOpportunity;
import xin.qhongchen.crm.entity.User;
import xin.qhongchen.crm.repository.SalesOppoRepository;
import xin.qhongchen.crm.repository.UserRepository;
import xin.qhongchen.crm.service.ClientService;
import xin.qhongchen.crm.service.SalesOppoService;
import xin.qhongchen.crm.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    ClientService service;
    @Autowired
    SalesOppoService salesOppoService;
    @Autowired
    UserRepository userRepository;

    @Autowired
    SalesOppoRepository salesOppoRepository;

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {

        User user1 = userRepository.findOne(1);
        User user2 = userRepository.findOne(2);

        user1.setUserName("hhgggg");
        userService.updateUser(user1);

    }

}
