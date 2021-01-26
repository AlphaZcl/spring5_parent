package top.zhuchl.springmvc.resolver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * 自定义视图解析器
 * @author zclys
 * @date 2021/1/26 9:26
 */
public class CustViewResolver implements ViewResolver, Ordered {

    private static final Logger logger = LoggerFactory.getLogger(CustViewResolver.class);

    @Autowired
    private View custView;

    private int order = Ordered.LOWEST_PRECEDENCE;  // default: same as non-Ordered

    @Override
    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        logger.info("自定义视图解析器执行");
        if(viewName.startsWith("cust:")){
            logger.info(viewName.substring(viewName.indexOf(":")+1));
            return this.custView;
        }
        return null;
    }
}
