package top.zhuchl.spring.resolver;

import org.springframework.core.Ordered;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import top.zhuchl.spring.exception.TestException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zclys
 * @date 2021/2/24 14:27
 */
public class CustExResolver implements HandlerExceptionResolver, Ordered {

    private int order = Ordered.HIGHEST_PRECEDENCE;

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        if(ex instanceof TestException){
            return new ModelAndView("error");
        }
        return null;
    }

    @Override
    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
