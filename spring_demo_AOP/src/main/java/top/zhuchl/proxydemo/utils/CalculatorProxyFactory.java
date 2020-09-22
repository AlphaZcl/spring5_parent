package top.zhuchl.proxydemo.utils;

import top.zhuchl.proxydemo.service.CalculatServiceInterface;

import java.lang.reflect.Proxy;

/**
 * 日志处理器
 *
 * @author zclys
 * @date 2020/9/18 14:55
 */
public class CalculatorProxyFactory {

    public static CalculatServiceInterface createProxy(final Object target) {
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] classes = target.getClass().getInterfaces();
        Object proxyObj = Proxy.newProxyInstance(classLoader, classes, (proxy, method, args) -> {
            Object result = null;
            try {
                LoggerUtils.loggerStart(method,args);
                result = method.invoke(target, args);
                LoggerUtils.loggerReturn(method,result);
            } catch (Exception e) {
                LoggerUtils.loggerException(e);
            } finally {
                LoggerUtils.loggerEnd(method);
            }
            return result;
        });
        if(!(target instanceof CalculatServiceInterface)){
            throw new RuntimeException("创建CalculatService代理对象错误");
        }
        return (CalculatServiceInterface)proxyObj;
    }
}
