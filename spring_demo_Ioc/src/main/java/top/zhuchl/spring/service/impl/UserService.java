package top.zhuchl.spring.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import top.zhuchl.spring.entity.UserEntity;
import top.zhuchl.spring.service.BaseService;

/**
 * TODO
 *
 * @author zclys
 * @date 2020/9/17 16:43
 */
@Service
public class UserService extends BaseService<UserEntity> {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Override
    public void add(){
        baseRepository.save();
        logger.info("------UserService Override add-------");
    }
}
