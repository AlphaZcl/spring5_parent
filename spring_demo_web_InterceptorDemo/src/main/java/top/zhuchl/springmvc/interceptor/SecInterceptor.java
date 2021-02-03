package top.zhuchl.springmvc.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zclys
 * @date 2021/2/3 15:50
 */
public class SecInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(SecInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object param = request.getParameter("param1");
        logger.info("----SecInterceptor.preHandle:param:{}----",param);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.info("-----SecInterceptor.postHandle-----");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info("-----SecInterceptor.afterCompletion-----");
    }
}
