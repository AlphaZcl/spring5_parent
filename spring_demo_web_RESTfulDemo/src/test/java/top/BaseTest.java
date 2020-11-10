package top;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * TODO
 *
 * @author zclys
 * @date 2020/11/9 19:53
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:testconfig/spring/spring_demo_web_test.xml"})
public class BaseTest {

    @Test
    public void baseTest(){

    }
}
