package top.zhuchl.spring.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.zhuchl.spring.entity.UserEntity;

/**
 * 静态Bean工厂
 *
 * @author zclys
 * @date 2020/9/14 10:03
 */
public class BeanStaticFactory {

    private static final Logger logger = LoggerFactory.getLogger(BeanStaticFactory.class);

    public static UserEntity getBean(String username,String email,String sal){
        logger.info("-----------BeanStaticFactory.getBean-----------");
        UserEntity userBean = new UserEntity();
        userBean.setUsername(username);
        userBean.setEmail(email);
        userBean.setSal(sal);
        logger.info("------userBean:{}-------",userBean);
        return userBean;
    }
}
