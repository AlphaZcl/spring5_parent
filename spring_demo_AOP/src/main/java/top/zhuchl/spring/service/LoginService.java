package top.zhuchl.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 被增强类
 *
 * @author zclys
 * @date 2020/9/22 9:14
 */
@Service
public class LoginService {

    private static final Logger logger = LoggerFactory.getLogger(LoginService.class);

    public String loginIn(String username,String password){
        logger.info("用户{}登录了，登录时间：{}",username,new SimpleDateFormat("yyyy-MM-dd HHmmss").format(new Date()));
        String result = "{res : 登录成功}";
        return result;
    }
}
