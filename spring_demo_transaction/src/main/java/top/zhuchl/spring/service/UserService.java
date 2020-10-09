package top.zhuchl.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.zhuchl.spring.dao.UserDao;
import top.zhuchl.spring.entity.UserInfo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author zclys
 * @date 2020/9/28 9:09
 */
@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserDao userDao;

    @Transactional
    public void updateUserInfo(String userAcco,String salary){
        Map<String, Object> params = new HashMap<>();
        params.put("userAcco",userAcco);
        params.put("salary",new BigDecimal(salary));
        userDao.update(params);
        int a = 10/0;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updateEmail(String userAcco,String email){
        Map<String,Object> params = new HashMap<>();
        params.put("userAcco",userAcco);
        params.put("email",email);
        userDao.updateEmail(params);
    }

    @Transactional
    public void findAllUser(){
        List<UserInfo> resList = userDao.findAll();
        resList.forEach(System.out::println);
    }
}
