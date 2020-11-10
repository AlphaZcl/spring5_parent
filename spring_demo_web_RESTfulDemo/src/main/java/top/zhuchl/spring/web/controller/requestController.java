package top.zhuchl.spring.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.zhuchl.spring.web.entity.RequestEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 请求参数绑定处理
 *
 * @author zclys
 * @date 2020/11/9 21:56
 */
@Controller
@RequestMapping("web")
public class requestController {

    private static final Logger logger = LoggerFactory.getLogger(requestController.class);

    /**
     * 默认绑定，请求参数与入参同名，进行绑定
     *
     * @param username
     * @return
     */
    @RequestMapping("request/handler01")
    public String handler01(String username, String id) {
        logger.info("--------入参：{},{}--------", username, id);
        return "success";
    }

    /**
     * 使用注解@RequestParam进行请求参数绑定
     *
     * @param username
     * @return
     */
    @RequestMapping("request/handler02")
    public String handler02(@RequestParam(value = "user", required = false, defaultValue = "admin") String username) {
        logger.info("--------入参：{}--------", username);
        return "success";
    }

    /**
     * 使用注解 @RequestHeader进行请求报头信息绑定
     *
     * @param userAgent
     * @param connTyp
     * @param language
     * @return
     */
    @RequestMapping("request/handler03")
    public String handler03(@RequestHeader("User-Agent") String userAgent,
                            @RequestHeader("Connection") String connTyp,
                            @RequestHeader("Accept-Language") String language) {
        logger.info("--------入参：{}--------", userAgent + "," + connTyp + "," + language);
        return "success";
    }

    /**
     * 使用注解@CookieValue 进行Cookie信息绑定
     *
     * @param sessionId
     * @param timeout
     * @param path
     * @param domain
     * @param secure
     * @return
     */
    @RequestMapping("request/handler04")
    public String handler04(@CookieValue(value = "JSESSIONID", required = false) String sessionId,
                            @CookieValue(value = "Expires", required = false) String timeout,
                            @CookieValue(value = "Path", required = false) String path,
                            @CookieValue(value = "Domain", required = false) String domain,
                            @CookieValue(value = "Secure", required = false) String secure
    ) {
        logger.info("--------入参：{}--------", sessionId + ",\n" + timeout + ",\n" + path + ",\n" + domain + ",\n" + secure);
        return "success";
    }

    /**
     * 使用POJO类型进行请求参数绑定
     * @param reqParam
     * @return
     */
    @RequestMapping("request/handler05")
    public String handler05(RequestEntity reqParam) {
        logger.info("--------入参：{}--------", reqParam);
        return "success";
    }


    @RequestMapping("request/handler06")
    public String handler06(HttpServletRequest request, HttpSession session, HttpServletResponse response) {
        logger.info("--------handler06---------");
        request.setAttribute("reqParam","request域中的");
        
        session.setAttribute("sessionParam","session域中的");
        return "success";
    }
}
