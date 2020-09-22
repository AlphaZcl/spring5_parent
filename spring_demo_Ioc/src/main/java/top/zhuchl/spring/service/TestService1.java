package top.zhuchl.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import top.zhuchl.spring.entity.UserEntity;

/**
 * TODO
 *
 * @author zclys
 * @date 2020/9/16 14:34
 */
@Service
public class TestService1 {

    private static final Logger logger = LoggerFactory.getLogger(TestService1.class);

    @Autowired
    public void execute(@Qualifier("user2") UserEntity userEntity){
        logger.info("--------TestService1.execute({})--------",userEntity);
    }
}
