package top.zhuchl.spring.repository.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import top.zhuchl.spring.entity.UserEntity;
import top.zhuchl.spring.repository.BaseRepository;
import top.zhuchl.spring.service.BaseService;

/**
 *
 * @author zclys
 * @date 2020/9/16 15:22
 */
@Repository
public class UserRepository extends BaseRepository<UserEntity> {

    private static final Logger logger = LoggerFactory.getLogger(UserRepository.class);

    public void save(){
        logger.info("------UserRepository.save------");
    }
}
