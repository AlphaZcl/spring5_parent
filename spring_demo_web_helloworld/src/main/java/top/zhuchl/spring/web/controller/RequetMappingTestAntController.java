package top.zhuchl.spring.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试RequestMapping的模糊匹配功能
 * Ant风格
 *
 * @author zclys
 * @date 2020/10/26 13:15
 */
@Controller
@RequestMapping("web")
public class RequetMappingTestAntController {

    private static final Logger logger = LoggerFactory.getLogger(RequetMappingTestAntController.class);


    @RequestMapping("ant/test01")
    public String antTest01(){
        logger.info("-------Ant-Test01-------");
        return "success";
    }

    /**
     * ？ ：单字符匹配
     * 当请求路径有异议时以精准匹配优先
     * @return
     */
    @RequestMapping("ant/test0?")
    public String anttest02(){
        logger.info("-------Ant-Test02-------");
        return "success";
    }

    /**
     * * 匹配任意字符
     * 当请求路径有异议时以精准匹配优先
     * @return
     */
    @RequestMapping("ant/test0*")
    public String anttest03(){
        logger.info("-------Ant-Test03-------");
        return "success";
    }

    /**
     * * 匹配一层路径
     * 当请求路径有异议时以精准匹配优先
     * @return
     */
    @RequestMapping("ant/*/test0*")
    public String anttest04(){
        logger.info("-------Ant-Test04-------");
        return "success";
    }

    /**
     * * 匹配多层路径
     * 当请求路径有异议时以精准匹配优先
     * @return
     */
    @RequestMapping("ant/**/test0*")
    public String anttest05(){
        logger.info("-------Ant-Test05-------");
        return "success";
    }

    @RequestMapping("user/{id}")
    public String pathVariableTest(@PathVariable("id") String userID){
        logger.info("-------pathVariableTest:id{}-------",userID);
        return "success";
    }

}
