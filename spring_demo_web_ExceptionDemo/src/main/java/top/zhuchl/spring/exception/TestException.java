package top.zhuchl.spring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author zclys
 * @date 2021/2/22 14:30
 */
//@ResponseStatus(value = HttpStatus.UNAUTHORIZED,reason = "TEST-Exception")
public class TestException extends RuntimeException{

}
