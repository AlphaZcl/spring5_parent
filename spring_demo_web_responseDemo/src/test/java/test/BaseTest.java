package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * TODO
 *
 * @author zclys
 * @date 2020/11/10 22:18
 */
@ContextConfiguration(locations = {"classpath:testconf/spring/spring_demo_web_responseDemoTest.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseTest {

    @Test
    public void baseTest(){}
}
