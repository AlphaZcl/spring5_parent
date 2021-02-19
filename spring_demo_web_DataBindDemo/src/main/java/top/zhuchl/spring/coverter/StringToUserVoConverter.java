package top.zhuchl.spring.coverter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;
import top.zhuchl.spring.vo.UserVO;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 自定义类型转换器
 *
 * @author zclys
 * @date 2021/2/7 16:47
 */
public class StringToUserVoConverter implements Converter<String, UserVO> {

    private static final Logger logger = LoggerFactory.getLogger(StringToUserVoConverter.class);

    private static String Delimiter = "-";

    @Override
    public UserVO convert(String source) {
        logger.info("自定义类型转换");
        UserVO userVO = new UserVO();
        if(!source.contains(Delimiter)){
            return userVO;
        }
        String[] colums = source.split("[-]",-1);
        try {
            userVO.setUserName(colums[0]);
            userVO.setBirth(new SimpleDateFormat("yyyy-MM-dd").parse(colums[1]));
        } catch (ParseException e) {
            logger.info("属性格式转换出错：{}",e.getMessage());
        }
        return userVO;
    }
}
