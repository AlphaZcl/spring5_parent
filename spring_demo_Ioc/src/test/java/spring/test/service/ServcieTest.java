package spring.test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.zhuchl.spring.repository.impl.UserRepository;
import top.zhuchl.spring.service.TestService1;
import top.zhuchl.spring.service.TestService2;

/**
 * TODO
 *
 * @author zclys
 * @date 2020/9/16 15:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/spring_demo_component_scan.xml"})
public class ServcieTest {

    @Autowired
    private TestService1 testService1;

    @Autowired
    private TestService2 testService2;

    @Autowired(required = false)
    private UserRepository userRepository;

    @Test
    public void test(){
        System.out.println(testService1);
        System.out.println(userRepository.getClass().getGenericSuperclass());
        testService2.execute();
    }


}
