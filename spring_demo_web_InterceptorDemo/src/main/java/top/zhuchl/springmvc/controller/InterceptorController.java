package top.zhuchl.springmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * 拦截器demo处理器
 *
 * @author zclys
 * @date 2020/12/17 11:55
 */
@Controller
@RequestMapping("web/InterceptorDemo")
public class InterceptorController {

    private static  final Logger logger = LoggerFactory.getLogger(InterceptorController.class);

    @RequestMapping("test1")
    public String testInterceptor1(@RequestParam(value = "param1",required = false) String p1,
                        @RequestParam(value = "param2",required = false)String p2){
        logger.info("handler对应的处理方法：InterceptorController.testInterceptor1");
        return "success";
    }
}
