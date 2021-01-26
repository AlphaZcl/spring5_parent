package top.zhuchl.springmvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

/**
 * @author zclys
 * @date 2021/1/15 14:30
 */
@Controller
@RequestMapping("web/MsgService")
public class InternationalController {

    private static final Logger logger = LoggerFactory.getLogger(InternationalController.class);

    @Autowired
    private ResourceBundleMessageSource messageSource;

    @RequestMapping("test")
    public String toPage(){
        return "success";
    }

    @RequestMapping(value = "GetMsg",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String testMsg(Locale locale){
        logger.info("Local:{}",locale);
        String message = messageSource.getMessage("web.msg",new Object[]{"user","zcl"},locale);
        logger.info("message:{}",message);
        String json = "{\"message\":\""+message+"\"}";
        return json;
    }

    @RequestMapping("views")
    public String testView(){
        return "myView";
    }

    @RequestMapping("views2")
    public String testView2(){
        return "custView";
    }

    @RequestMapping("views3")
    public String testView3(){
        return "cust:custView22";
    }
}
