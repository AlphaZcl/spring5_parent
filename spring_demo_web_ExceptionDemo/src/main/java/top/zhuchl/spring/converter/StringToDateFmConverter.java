package top.zhuchl.spring.converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zclys
 * @date 2021/2/4 11:07
 */
public class StringToDateFmConverter implements Converter<String, Date> {

    private static final Logger logger = LoggerFactory.getLogger(StringToDateFmConverter.class);

    private String pattern;

    @Override
    public Date convert(String source) {
        Date res = null;
        try {
            res = new SimpleDateFormat(pattern).parse(source);
        } catch (ParseException e) {
            logger.error("日期格式错误:{}",e.getMessage());
        }
        return res;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
