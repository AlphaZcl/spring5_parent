package top.zhuchl.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 复合事务测试类，测试事务的传递性
 *
 * @author zclys
 * @date 2020/10/2 10:48
 */
@Service
public class MulService {

    private static final Logger logger = LoggerFactory.getLogger(MulService.class);

    @Autowired
    private UserService userService;

    @Transactional
    public void mulTx(){
        logger.info("------复合事务测试------");
        String userAcco2 = "test000002";
        String email = "zclys06@163.com";
        userService.updateEmail(userAcco2,email);
        String userAcco1 = "test000001";
        String salary = "9999";
        userService.updateUserInfo(userAcco1,salary);
    }
}
