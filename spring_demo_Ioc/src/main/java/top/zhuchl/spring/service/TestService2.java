package top.zhuchl.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zhuchl.spring.entity.UserEntity;

import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author zclys
 * @date 2020/9/16 15:39
 */
@Service
public class TestService2 {

    private static final Logger logger = LoggerFactory.getLogger(TestService2.class);

    @Autowired
    private UserEntity[] entities;

    @Autowired
    private List<UserEntity> userList;

    @Autowired
    private Map<String,UserEntity> objMap;

    public void execute(){
        logger.info("--------TestService2.entities[0]:{}--------", entities[0]);
        logger.info("--------TestService2.entities[1]:{}--------", entities[1]);
        logger.info("--------TestService2.userList:{}--------",userList);
        logger.info("------------------Map属性的自动装配-------------------");

        for (Map.Entry<String , UserEntity> entry : objMap.entrySet()){
            logger.info("objMap:[{},{}]",entry.getKey(),entry.getValue());
        }

    }
}
