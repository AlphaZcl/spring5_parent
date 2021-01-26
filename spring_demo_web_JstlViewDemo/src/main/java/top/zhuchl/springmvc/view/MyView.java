package top.zhuchl.springmvc.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Map;

/**
 * @author zclys
 * @date 2021/1/19 10:25
 */
@Component
public class MyView extends AbstractView {

    private static final Logger logger = LoggerFactory.getLogger(MyView.class);


    @Override
    protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.info("继承AbstractView的视图MyView的renderMergedOutputModel方法");
        response.getWriter().println("MyView:"+new Date());
    }
}
