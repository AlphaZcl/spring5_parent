package top.zhuchl.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import top.zhuchl.spring.service.LoginService;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author zclys
 * @date 2020/9/22 9:22
 */
public class LoginPlusService {

    private static final Logger logger = LoggerFactory.getLogger(LoginService.class);

    public void beforeLogin(JoinPoint joinPoint){
        logger.info("Before:方法{}开始执行，参数{}",joinPoint.getSignature().getName(), Arrays.asList(joinPoint.getArgs()));
    }

    public void afterLogin(JoinPoint joinPoint){
        logger.info("After:方法{}执行完毕",joinPoint.getSignature().getName());
    }

    public void afterReturn(JoinPoint joinPoint,Object res){
        logger.info("AfterReturn:方法{}返回值{}",joinPoint.getSignature().getName(),res);
    }

    public void afterException(JoinPoint joinPoint,Throwable throwable){
        logger.info("AfterThrowing:方法{}执行异常，原因：{}",joinPoint.getSignature().getName(),throwable.getCause());
    }

    public String aroundLogin(ProceedingJoinPoint joinPoint){
        logger.info("around;开始执行");
        String result = "";
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        logger.info("around:方法{}开始进行参数校验,参数{}",joinPoint.getSignature().getName(),args);
        for(Object arg : args){
            if(StringUtils.isEmpty(arg)){
                logger.info("用户数据非法");
                result ="用户数据非法";
                return result;
            }
        }
        logger.info("执行原方法{}",joinPoint.getSignature().getName());
        try {
            result = joinPoint.proceed().toString();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }

}
