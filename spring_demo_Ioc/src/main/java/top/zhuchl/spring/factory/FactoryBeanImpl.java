package top.zhuchl.spring.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import top.zhuchl.spring.entity.UserEntity;

/**
 * 实现FactoryBean接口进行Bean工厂类创建
 *
 * @author zclys
 * @date 2020/9/14 20:19
 */
public class FactoryBeanImpl implements FactoryBean<UserEntity> {

    private static final Logger logger = LoggerFactory.getLogger(FactoryBeanImpl.class);

    @Value("${content.username}")
    private String username;

    @Value("${content.email}")
    private String email;

    public UserEntity getObject() throws Exception {
        logger.info("获取Bean：FactoryBeanImpl.getObject");
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(username);
        userEntity.setEmail(email);
        logger.info("------userBean:{}-------",userEntity);
        return userEntity;
    }

    public Class<?> getObjectType() {
        return UserEntity.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
