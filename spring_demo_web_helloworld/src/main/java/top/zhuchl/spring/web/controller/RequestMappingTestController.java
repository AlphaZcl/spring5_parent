package top.zhuchl.spring.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * RequestMapping测试
 *
 * @author zclys
 * @date 2020/10/14 22:50
 */
@Controller
@RequestMapping("/web")
public class RequestMappingTestController {

    private static final Logger logger = LoggerFactory.getLogger(RequestMappingTestController.class);

    @RequestMapping(value = "/handler01",method = RequestMethod.POST)
    public String handler01(){
        logger.info("------handler01 Process-----");
        return "success";
    }

    @RequestMapping(value = "/handler02",params = {"!username"})
    public String handler02(){
        logger.info("--------handler02 Process----");
        return "success";
    }

    /**
     * 只让谷歌浏览器访问
     * @return
     */
    @RequestMapping(value = "/handler03",headers = {"User-Agent=Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3970.5 Safari/537.36"})
    public String handler03(){
        logger.info("--------handler03 Process----");
        return "success";
    }

}
