package top.zhuchl.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局前置处理器
 *
 * @author zclys
 * @date 2021/2/19 11:43
 */
@ControllerAdvice
public class GlobleController {

    private static final Logger logger = LoggerFactory.getLogger(GlobleController.class);

    @ModelAttribute
    public void globalFunBefore(ModelAndView mv) {
        logger.info("-----global_before，前置处理------");
        Map<String, Object> resMap = new HashMap<>();
        Map<String, Object> head = new HashMap<>();
        head.put("jnl", "123456789");
        head.put("SvrCod", "000001");
        head.put("MsgID", "123456789");
        resMap.put("head", head);
        Map<String, Object> body = new HashMap<>();
        resMap.put("body", body);
        mv.addAllObjects(resMap);
    }
}
