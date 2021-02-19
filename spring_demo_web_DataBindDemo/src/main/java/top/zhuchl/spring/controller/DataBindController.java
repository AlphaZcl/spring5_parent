package top.zhuchl.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import top.zhuchl.spring.vo.UserVO;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zclys
 * @date 2021/1/26 16:48
 */
@RequestMapping("web/DataBind")
@Controller
public class DataBindController {

    private static final Logger logger = LoggerFactory.getLogger(DataBindController.class);

    @RequestMapping("bind1")
    @ResponseBody
    public String testBind1(@ModelAttribute("user") UserVO userVO){
        logger.info("userVO:{}",userVO);
        return "success";
    }

    @RequestMapping("bind2")
    public String testBind2(@Valid UserVO userVO, BindingResult bindingResult, ModelMap model){
        logger.info("userVO:{}",userVO);
        String res = "success";
        if(bindingResult.hasErrors()){
            List<FieldError> errors = bindingResult.getFieldErrors();
            Map<String, Object> errorsMap = new HashMap<>();
            for(FieldError error : errors){
                logger.info("{}绑定错误:{}",error.getField(),error.getDefaultMessage());
                logger.info("--------");
                errorsMap.put(error.getField(),error.getDefaultMessage());
            }
            res = "test";
            model.addAttribute("errorInfo",errorsMap);
        }
        return res;
    }

    @RequestMapping("bind3")
    public String testBind3(@RequestParam("user") UserVO userVO){
        logger.info("自定义转换器的转换的参数：{}",userVO);
        return "success";
    }

    @RequestMapping("bind4")
    @ResponseBody
    public UserVO testJson(@Valid @RequestBody UserVO userVO){
        logger.info("userVO:{}",userVO);

        return userVO;
    }
}
