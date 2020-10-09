package top.zhuchl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 *
 * @author zclys
 * @date 2020/9/28 9:04
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/spring_demo_transaction_test.xml"})
public class BaseTest {

    @Test
    public void test(){
        System.out.println("测试。。。。");
    }
}
