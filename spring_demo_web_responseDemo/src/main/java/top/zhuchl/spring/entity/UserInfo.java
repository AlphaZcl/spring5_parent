package top.zhuchl.spring.entity;

/**
 * 数据库UserInfo 表实体类，
 *
 * @author zclys
 * @date 2020/11/15 9:55
 */
public class UserInfo {

    private String userAccoNo;

    private String email;

    private String phone;

    private String username;

    private String password;

    private Address address;

    public String getUserAccoNo() {
        return userAccoNo;
    }

    public void setUserAccoNo(String userAccoNo) {
        this.userAccoNo = userAccoNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userAccoNo='" + userAccoNo + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address=" + address +
                '}';
    }
}
