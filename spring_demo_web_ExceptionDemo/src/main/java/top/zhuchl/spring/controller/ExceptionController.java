package top.zhuchl.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import top.zhuchl.spring.VO.ParamVO;
import top.zhuchl.spring.exception.TestException;

import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zclys
 * @date 2021/2/4 11:05
 */
@Controller
@RequestMapping("web/exception")
public class ExceptionController {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionController.class);

    @RequestMapping("dateExcept1")
    public String testExcept1(@Valid @ModelAttribute("param") ParamVO param, BindingResult result, ModelMap model){
        logger.info("参数：{}",param);
        if(result.hasErrors()){
            List<FieldError> errList = result.getFieldErrors();
//            Map<String,Object> errorMap = new HashMap<>();
            for(FieldError error : errList){
                logger.info(error.getField()+":"+error.getDefaultMessage());
//                errorMap.put(error.getField(),error.getDefaultMessage());
            }
//            model.addAttribute("errorInfo",errorMap);
            throw new IllegalArgumentException("参数格式错误");
//            return "testPage";
        }
        return "success";
    }

    @RequestMapping("testExcept")
    public String testException(@RequestParam("param") String str){
        if(!StringUtils.isEmpty(str)){
            logger.info("测试异常");
            throw new TestException();
        }
        return "success";
    }

    @RequestMapping("testExcept2")
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED,reason = "方法测试")
    public String testExcept2(@RequestParam(value = "id",defaultValue = "0") Integer id){
        logger.info("ResponseStatus Test");
        return "success";
    }

    @RequestMapping(value = "testDefaultHandlerExceptionResolver",method = RequestMethod.POST)
    public String testDefaultHandlerExceptionResolver(){
        logger.info("testDefaultHandlerExceptionResolver");
        return "success";
    }

    @RequestMapping("simple")
    public String testSim(){
        logger.info("异常转发测试");
        return "success";
    }
}
