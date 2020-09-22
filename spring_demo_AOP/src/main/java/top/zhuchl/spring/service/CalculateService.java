package top.zhuchl.spring.service;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

/**
 * 被增强类
 *
 * @author zclys
 * @date 2020/9/18 14:52
 */
@Service
public class CalculateService {


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
