package top.zhuchl.springtest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.zhuchl.BaseTest;
import top.zhuchl.spring.service.CalculateService;
import top.zhuchl.spring.service.LoginService;

/**
 * TODO
 *
 * @author zclys
 * @date 2020/9/21 15:52
 */
public class springAopTest extends BaseTest {

    @Autowired
    private CalculateService calculateService;

    @Autowired
    private LoginService loginService;

    @Test
    public void testClaculate(){
        calculateService.add(1,2);
//        calculateService.sub(3,4);
//        calculateService.mul(5,6);
//        calculateService.div(8,1);
    }

    @Test
    public void testLogin(){
        String username = "zhuchl";
        String password = "zcl123.";
        loginService.loginIn(username,password);
    }
}
