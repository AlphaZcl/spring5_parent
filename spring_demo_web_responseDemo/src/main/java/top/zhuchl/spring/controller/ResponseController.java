package top.zhuchl.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * 响应数据输出
 *
 *  SessionAttributes
 *       给BindingAwareModelMap中保存的数据，或者ModelAndView中的数据，同时给session中放一份；
 *       value指定保存数据时要给session中放的数据的key
 * @author zclys
 * @date 2020/11/13 14:13
 */
@Controller
@RequestMapping("spring_demo_web_responseDemo")
@SessionAttributes(value = {"param1","param2"},types = {String.class})
public class ResponseController {

    private static final Logger logger = LoggerFactory.getLogger(ResponseController.class);

    /**
     * 入参Map，放入Map的数据也会放一份到请求域中
     * @param map
     * @return
     */
    @RequestMapping("web/handler01")
    public String handler01(Map<String, Object> map){
        map.put("param1","Map");
        map.put("param2","session1");
        logger.info("---------handler01,Map入参---------");
        return "success";
    }

    /**
     * 入参ModelMap，放入ModelMap的数据也会放一份到请求域中
     * @param modelMap
     * @return
     */
    @RequestMapping("web/handler02")
    public String handler02(ModelMap modelMap){
        modelMap.addAttribute("param1","ModelMap");
        modelMap.addAttribute("param2",111);
        logger.info("---------handler02,ModelMap入参---------");
        return "success";
    }

    /**
     * 入参Model，放入Model的数据也会放一份到请求域中
     * @param model
     * @return
     */
    @RequestMapping("web/handler03")
    public String handler03(Model model){
        model.addAttribute("param1","Model");
        logger.info("---------handler03,Model入参---------");
        return "success";
    }

    /**
     * 使用ModelAndVie返回数据和视图
     * 之前返回的String值就是视图名称，视图解析器会帮助我们拼串得到页面的真实地址
     * @return
     */
    @RequestMapping("web/handler04")
    public ModelAndView handler04(){
//        ModelAndView mv = new ModelAndView("success");
        ModelAndView mv = new ModelAndView();
        mv.addObject("param1","ModelAndView");
        mv.setViewName("success");
        logger.info("---------handler04,ModelAndView---------");
        return mv;
    }
}
