package top.zhuchl.spring.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.zhuchl.spring.entity.UserEntity;

/**
 * 实例工厂类
 *
 * @author zclys
 * @date 2020/9/14 19:36
 */
public class BeanFactoryUtils {

    private static final Logger logger = LoggerFactory.getLogger(BeanFactoryUtils.class);

    public BeanFactoryUtils() {
        logger.info("-------实例Bean工厂构造器--------");
    }

    public void initFactory(){
        logger.info("-------实例Bean工厂的初始化方法：initFactory--------");
    }

    public void destroyFactory(){
        logger.info("-------实例Bean工厂的销毁方法：initFactory--------");
    }

    public UserEntity getBean(String username,String email){
        logger.info("BeanFactoryUtils.getBean");
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(username);
        userEntity.setEmail(email);
        logger.info("------userBean:{}-------",userEntity);
        return userEntity;
    }
}
