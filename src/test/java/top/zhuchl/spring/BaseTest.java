package top.zhuchl.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.zhuhcl.spring.service.TestService;

/**
 * TODO
 *
 * @author zclys
 * @date 2020/9/10 15:41
 */
@ContextConfiguration(locations = {"classpath:config/spring/spring-test.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseTest {

    @Autowired
    private TestService testService;

    @Test
    public  void baseTest(){
        testService.testE();
    }

}
