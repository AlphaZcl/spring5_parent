package top.zhuchl.proxydemo.utils;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 切面类
 *
 * @author zclys
 * @date 2020/9/21 9:04
 */
public class LoggerUtils {

    public static void loggerStart(Method method,Object... obj){
        System.out.println("方法"+method.getName()+"执行了，参数：{"+ Arrays.asList(obj)+"}");
    }

    public static void loggerReturn(Method method,Object result) {
        System.out.println("方法"+method.getName()+"返回结果："+result);
    }

    public static void loggerException(Exception e) {
        System.out.println("执行异常，原因："+e.getCause());
    }

    public static void loggerEnd(Method method) {
        System.out.println("方法"+method.getName()+"执行完毕");
    }
}
