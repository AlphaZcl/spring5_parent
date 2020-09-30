package top.zhuchl.jdbctemplatetest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.zhuchl.BaseTest;
import top.zhuchl.spring.dao.UserDao;
import top.zhuchl.spring.dao.UserNamedParamDao;
import top.zhuchl.spring.entity.UserInfo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author zclys
 * @date 2020/9/23 10:30
 */
public class UserDaoTest extends BaseTest {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserNamedParamDao userNamedParamDao;

    @Test
    public void test(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserAcco("test000007");
        userInfo.setUserName("test7");
        userInfo.setPhoneNo("12311111111");
        userInfo.setEmail("test7@163.com");
        userInfo.setSalary(new BigDecimal("4000"));
//        userDao.add(userInfo);
//        userDao.update(userInfo);
//        System.out.println(userDao.findOne(userInfo));
//        userDao.findAll().forEach(System.out::println);
//        userNamedParamDao.add(userInfo);
//        userNamedParamDao.update(userInfo);
        userNamedParamDao.getUserInfo(userInfo).forEach(System.out::println);
    }

    @Test
    public void test2(){
        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("userAcco","test000006");
        paramMap.put("userName","test6");
        paramMap.put("phoneNo","12311111111");
        paramMap.put("email","test6@163.com");
        paramMap.put("salary",new BigDecimal(10000));
        userNamedParamDao.add(paramMap);
    }
}
