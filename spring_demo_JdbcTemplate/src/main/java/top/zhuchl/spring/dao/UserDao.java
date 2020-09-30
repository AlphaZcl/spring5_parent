package top.zhuchl.spring.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import top.zhuchl.spring.entity.UserInfo;

import java.math.BigDecimal;
import java.util.List;

/**
 * jdbcTemplate持久化操作
 *
 * @author zclys
 * @date 2020/9/23 10:13
 */
@Repository
public class UserDao {

    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void add(UserInfo userInfo){
        String sql = "insert into user_info(user_acco,user_name,phone_no,email,salary) values(?,?,?,?,?)";
        Object[] args = {userInfo.getUserAcco(),
                userInfo.getUserName(), userInfo.getPhoneNo(), userInfo.getEmail()};
        jdbcTemplate.update(sql,args);
        logger.info("测试完毕");
    }

    public void update(UserInfo userInfo){
        String sql = "update user_info set salary = ? where user_acco = ?";
        Object[] args = {userInfo.getSalary(),userInfo.getUserAcco()};
        jdbcTemplate.update(sql,args);
        logger.info("更改完毕");
    }

    public UserInfo findOne(UserInfo userParams){
        String sqlExc = "";
        Object[] args = {userParams.getUserAcco()};
        if(userParams.getSalary() != null){
            sqlExc = "and salary = ? ";
            args = new Object[]{userParams.getUserAcco(),userParams.getSalary()};
        }
        String sql2 = "select sys_id,user_acco,user_name,phone_no,email,salary from user_info where user_acco = ? " + sqlExc;

        UserInfo userResult = jdbcTemplate.queryForObject(sql2,new BeanPropertyRowMapper<UserInfo>(UserInfo.class),args);
        return userResult;
    }

    public List<UserInfo> findAll(){
        String sql = "select * from user_info";
        List<UserInfo> resList = jdbcTemplate.query(sql,new BeanPropertyRowMapper<UserInfo>(UserInfo.class));
        return resList;
    }


}
