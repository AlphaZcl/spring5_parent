package top.zhuchl.proxydemo.service.impl;

import top.zhuchl.proxydemo.service.CalculatServiceInterface;

/**
 *
 * @author zclys
 * @date 2020/9/18 14:52
 */
public class CalculatServiceImpl implements CalculatServiceInterface {


    public int add(int a, int b){
        return a + b ;
    }

    public int sub(int a, int b){
        return a - b ;
    }

    public int mul(int a, int b){
        return a * b ;
    }

    public int div(int a, int b){
        return a / b ;
    }
}
