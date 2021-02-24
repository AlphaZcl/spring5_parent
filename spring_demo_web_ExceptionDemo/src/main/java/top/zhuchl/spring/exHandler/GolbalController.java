package top.zhuchl.spring.exHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zclys
 * @date 2021/2/4 15:58
 */
@ControllerAdvice
public class GolbalController {

    private static final Logger logger = LoggerFactory.getLogger(GolbalController.class);

    @ExceptionHandler(value = {java.lang.IllegalArgumentException.class})
    public ModelAndView exHandler(Exception ex){
        logger.info("出现异常：{}",ex.getMessage());
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("exception",ex.getMessage());
        return mv;
    }
}
