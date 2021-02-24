package top.zhuchl.spring.VO;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Future;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 * @author zclys
 * @date 2021/2/4 14:36
 */
public class ParamVO {

    @DateTimeFormat(pattern = "yyyy-MM-dd",style = "SS")
    @Past
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ParamVO{" +
                "date=" + date +
                '}';
    }
}
