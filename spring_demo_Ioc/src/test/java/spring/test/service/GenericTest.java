package spring.test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.zhuchl.spring.service.BaseService;
import top.zhuchl.spring.service.impl.BookService;
import top.zhuchl.spring.service.impl.UserService;

/**
 * TODO
 *
 * @author zclys
 * @date 2020/9/17 15:23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/spring_demo_generic.xml"})
public class GenericTest {

    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    @Test
    public void test(){
        System.out.println(userService.getClass().getGenericSuperclass());
        System.out.println(bookService.getClass().getGenericSuperclass());
        userService.add();
        bookService.add();
    }

}
