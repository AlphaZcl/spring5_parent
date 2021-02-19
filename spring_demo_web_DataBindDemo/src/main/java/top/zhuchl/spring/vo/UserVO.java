package top.zhuchl.spring.vo;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.Null;
import javax.validation.constraints.Past;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zclys
 * @date 2021/1/26 16:51
 */
public class UserVO {

    @NotEmpty
    @Length(max = 30)
    private String userName;

    @Null
    private String password;

    @Email
    private String email;

    @NumberFormat(pattern = "###,###,###.##")
    private BigDecimal salary;

    @DateTimeFormat(pattern = "yyyy-MM-dd",style = "SS")
    @Past
    private Date birth;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", birth=" + birth +
                '}';
    }
}
