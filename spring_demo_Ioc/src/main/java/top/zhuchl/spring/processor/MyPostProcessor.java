package top.zhuchl.spring.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


/**
 * Bean的后置处理器
 *
 * @author zclys
 * @date 2020/9/15 11:47
 */
public class MyPostProcessor implements BeanPostProcessor {

    private static final Logger logger = LoggerFactory.getLogger(MyPostProcessor.class);

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        logger.info("-----{}的bean:后置处理器初始化前处理Before-------",bean.getClass().getName());
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        logger.info("-----{}的bean：后置处理器初始化后处理After-------",bean.getClass().getName());
        return bean;
    }
}
