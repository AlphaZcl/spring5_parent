package top.zhuchl.springmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 拦截器demo处理器
 *
 * @author zclys
 * @date 2020/12/17 11:55
 */
@Controller
@RequestMapping("spring_demo_web_InerceptorDemo")
public class InterceptorController {

    private static  final Logger logger = LoggerFactory.getLogger(InterceptorController.class);


    @RequestMapping("test1")
    public String test1(Map<String, Object> map){
        map.put("param1","11111");
        logger.info("---------InterceptorController.test1");
        return "success";
    }
}
