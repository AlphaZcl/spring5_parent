package top.zhuchl.spring.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * RESTful风格，用户信息操作控制器
 *
 * @author zclys
 * @date 2020/11/9 20:14
 */
@Controller
@RequestMapping("web")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "user/{AccoNo}",method = RequestMethod.GET)
    public String getUsers(@PathVariable("AccoNo") String accoNo){
        logger.info("--------查询到用户：{}-------",accoNo);
        return "success";
    }

    @RequestMapping(value = "user/{AccoNo}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable("AccoNo")String accoNo){
        logger.info("--------删除用户：{}--------",accoNo);
        return "success";
    }

    @RequestMapping(value = "user/{AccoNo}",method = RequestMethod.PUT)
    public String putUser(@PathVariable("AccoNo")String accoNo){
        logger.info("--------更新用户：{}--------",accoNo);
        return "success";
    }

    @RequestMapping(value = "user/{AccoNo}",method = RequestMethod.POST)
    public String addUser(@PathVariable("AccoNo") String accoNo){
        logger.info("--------添加用户：{}--------",accoNo);
        return "success";
    }
}
