package top.zhuchl.proxytest;

import org.junit.Test;
import top.zhuchl.proxydemo.service.CalculatServiceInterface;
import top.zhuchl.proxydemo.service.impl.CalculatServiceImpl;
import top.zhuchl.proxydemo.utils.CalculatorProxyFactory;

/**
 * TODO
 *
 * @author zclys
 * @date 2020/9/18 15:49
 */
public class ProxyTest {


    @Test
    public void test(){
        CalculatServiceInterface calculatProxy = CalculatorProxyFactory.createProxy(new CalculatServiceImpl());
        System.out.println(calculatProxy.getClass());
        calculatProxy.add(1,2);
        calculatProxy.sub(3,5);
        calculatProxy.mul(4,5);
        calculatProxy.div(3,1);
        calculatProxy.div(3,0);
    }
}
