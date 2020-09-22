package top.zhuhcl.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zhuhcl.spring.entity.User;

/**
 * TODO
 *
 * @author zclys
 * @date 2020/9/11 11:42
 */
@Service
public class TestService {

    private static Logger logger = LoggerFactory.getLogger(TestService.class);

    @Autowired
    private User user;

    public void testE(){
        logger.info(user.toString());
        System.out.println("Hello");
    }
}
