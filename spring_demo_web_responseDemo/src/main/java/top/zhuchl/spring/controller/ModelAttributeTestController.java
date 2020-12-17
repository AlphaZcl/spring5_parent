package top.zhuchl.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import top.zhuchl.spring.entity.UserInfo;

import java.util.Map;

/**
 * MolderAttribute注解测试
 *
 * @author zclys
 * @date 2020/11/15 9:41
 */
@Controller
@RequestMapping("spring_demo_web_responseDemo")
@SessionAttributes("userInfo1")
public class ModelAttributeTestController {

    private static final Logger logger = LoggerFactory.getLogger(ModelAttributeTestController.class);

    @ModelAttribute
    public void getDatabaseUser(Map<String,Object> map,UserInfo userParam){
        logger.info("------页面入参userAccNo：{}------",userParam);
        UserInfo userResult = new UserInfo();
        userResult.setUserAccoNo(userParam.getUserAccoNo());
        userResult.setEmail(userParam.getEmail());
        userResult.setAddress(userParam.getAddress());
        userResult.setUsername(userParam.getUsername());
        userResult.setPhone("2222222222");
        userResult.setPassword("3333333");
        logger.info("-------数据库查出的user信息：{}",userResult);
        map.put("userInfo1",userResult);
    }

    @RequestMapping(value = "web/userInfo",method = RequestMethod.PUT)
    public ModelAndView updateUserInfo(UserInfo userInfo){
        logger.info("更新方法使用的入参：userInfo={}",userInfo);
        ModelAndView mv = new ModelAndView("modelAttribute");
        mv.addObject("user",userInfo);
        return mv;
    }

    @RequestMapping(value = "web/userInfo", method = RequestMethod.POST)
    public String testHttpSessionException(UserInfo userInfo){
        logger.info("更新方法使用的入参：userInfo={}",userInfo);
        return "success";
    }
}
