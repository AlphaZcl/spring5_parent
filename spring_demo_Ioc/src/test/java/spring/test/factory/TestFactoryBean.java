package spring.test.factory;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import top.zhuchl.spring.entity.UserEntity;
import spring.test.BaseTest;

/**
 * TODO
 *
 * @author zclys
 * @date 2020/9/14 15:56
 */
public class TestFactoryBean extends BaseTest {

    @Qualifier("subUser1")
    @Autowired
    private UserEntity staticBean1;

    @Qualifier("subUser2")
    @Autowired
    private UserEntity staticBean2;

    @Test
    public void test(){
        System.out.println(staticBean1);
        System.out.println(staticBean2);
    }
}
