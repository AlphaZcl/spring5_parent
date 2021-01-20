package springmvc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 基础测试类
 *
 * @author zclys
 * @date 2020/12/17 11:51
 */
@ContextConfiguration(locations = {"classpath:conf/springmvc/springmvc-test.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseTest {

    private static final Logger logger = LoggerFactory.getLogger(BaseTest.class);

    @Test
    public void baseTest(){
        logger.info("BaseTest");
    }
}
