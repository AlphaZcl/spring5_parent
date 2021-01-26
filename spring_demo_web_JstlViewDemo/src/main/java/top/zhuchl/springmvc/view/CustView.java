package top.zhuchl.springmvc.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Map;

/**
 * @author zclys
 * @date 2021/1/25 10:27
 */
@Component
public class CustView implements View {

    private static final Logger logger = LoggerFactory.getLogger(CustView.class);

    @Override
    public String getContentType() {
        return null;
    }

    @Override
    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {

        logger.info("实现View接口的自定义视图的rander方法");
        response.getWriter().println("CustView:"+new Date());
    }
}
