package top.zhuchl.spring.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * spring web项目
 * 业务处理器/页面控制器
 *
 * @author zclys
 * @date 2020/9/22 15:47
 */
@Controller
@RequestMapping("web")
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("helloWorld.do")
    public String helloWorld(){
        logger.info("Hello World!");
        return "success";
    }
}
