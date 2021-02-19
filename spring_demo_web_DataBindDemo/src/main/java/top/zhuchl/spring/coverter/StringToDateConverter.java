package top.zhuchl.spring.coverter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将String对象转换为日期对象
 * Converter<S,T>：将 S 类型对象转为 T 类型对象
 * @author zclys
 * @date 2021/1/28 11:44
 */
public class StringToDateConverter implements Converter<String, Date> {

    private String pattern;

    @Override
    public Date convert(String source) {
        System.out.println("------");
        try {
            return new SimpleDateFormat(pattern).parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
