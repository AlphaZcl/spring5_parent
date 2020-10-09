package top.zhuchl.testtransaction.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.zhuchl.BaseTest;
import top.zhuchl.spring.service.MulService;
import top.zhuchl.spring.service.UserService;

/**
 * TODO
 *
 * @author zclys
 * @date 2020/9/28 9:41
 */
public class UserServiceTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Autowired
    private MulService mulService;

    @Test
    public void testTransaction(){
        String userAcco1 = "test000001";
        String salary = "9999";
        String userAcco2 = "test000002";
        String email = "zclys06@163.com";
        userService.updateUserInfo(userAcco1,salary);
        userService.updateEmail(userAcco2,email);
        System.out.println(userService.getClass());
    }

    @Test
    public void testMulTransaction(){
        mulService.mulTx();
    }

    @Test
    public void testTxIoslation(){
        userService.findAllUser();
    }

}
