package top.zhuchl.spring.entity;

import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * TODO
 *
 * @author zclys
 * @date 2020/9/14 14:14
 */
public class UserEntity {

    private String username;

    private String email;

    private String sal;

    public UserEntity() {
        System.out.println("-----目标bean的无参构造器创建------");
    }

    public void initBean(){
        System.out.println("-----目标bean的初始化方法：initBean------");
    }

    public void destroyBean(){
        System.out.println("-----目标bean的销毁方法：destroyBean------");
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", sal='" + sal + '\'' +
                '}';
    }
}
