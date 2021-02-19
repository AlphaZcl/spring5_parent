package top.zhuchl.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import top.zhuchl.spring.vo.UserVO;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 全局定义
 *
 * @author zclys
 * @date 2021/2/3 11:20
 */
@ControllerAdvice
public class GlobalControllerAdvice {

    private static final Logger logger = LoggerFactory.getLogger(GlobalControllerAdvice.class);

    @ModelAttribute
    public void globalBefore(ModelAndView mv){
        logger.info("---全局before方法---");
        mv.addObject("userVO",new UserVO());
    }

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
//        dataBinder.registerCustomEditor(String.class,new StringTrimmerEditor(true));
//        dataBinder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),false));
    }
}
