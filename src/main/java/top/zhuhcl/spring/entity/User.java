package top.zhuhcl.spring.entity;

import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author zclys
 * @date 2020/9/11 11:40
 */
public class User {
    private String username;

    private String email;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
