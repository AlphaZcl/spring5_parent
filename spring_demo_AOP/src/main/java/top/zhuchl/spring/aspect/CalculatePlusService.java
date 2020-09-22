package top.zhuchl.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 切面类增强类，横切关注点的具体体现，通知
 *
 * @author zclys
 * @date 2020/9/21 11:45
 */
@Aspect
@Component
public class CalculatePlusService {

    private static final Logger logger = LoggerFactory.getLogger(CalculatePlusService.class);

    @Pointcut("execution(* top.zhuchl.spring.service.CalculateService.* (..))")
    public void pointCalculateService(){}

    @Before("pointCalculateService()")
    public void loggerStart(JoinPoint  joinPoint){
        logger.info("Before:方法{}开始执行，参数:{}",joinPoint.getSignature().getName(), Arrays.asList(joinPoint.getArgs()));
    }

    @Around("execution(* top.zhuchl.spring.service.CalculateService.*(..))")
    public Object loggerAround(ProceedingJoinPoint joinPoint){
        logger.info("Around:方法{}开始执行了，参数:{}",joinPoint.getSignature().getName(), Arrays.asList(joinPoint.getArgs()));
        Object result = null;
        try {
            result = joinPoint.proceed();
            logger.info("Around:方法{}执行完了,结果：{}",joinPoint.getSignature().getName(),result);
        } catch (Throwable throwable) {
            logger.info("Around:方法{}执行出现异常,原因：{}",joinPoint.getSignature().getName(),throwable.getCause());
            throwable.printStackTrace();
        }
        return result;
    }

    @AfterReturning(pointcut = "pointCalculateService()",returning = "resObj")
    public void loggerRetun(JoinPoint joinPoint,Object resObj){
        logger.info("AfterReturning:方法{}执行的返回值：{}",joinPoint.getSignature().getName(),resObj);
    }

    @AfterThrowing(pointcut = "pointCalculateService()",throwing = "e")
    public void loggerException(JoinPoint joinPoint,Exception e){
        logger.info("AfterThrowing:方法{}执行异常，原因：{}",joinPoint.getSignature().getName(),e.getCause());
    }

    @After("pointCalculateService()")
    public void loggerEnd(JoinPoint joinPoint){
        logger.info("After：方法{}执行完毕",joinPoint.getSignature().getName());
    }

}
