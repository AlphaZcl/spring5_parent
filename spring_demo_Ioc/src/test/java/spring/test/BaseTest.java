package spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 *
 * @author zclys
 * @date 2020/9/14 9:55
 */
@ContextConfiguration(locations = {"classpath:config/spring/spring_demo_Ioc.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseTest {

    @Test
    public void baseTest(){
    }
}
