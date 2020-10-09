package top.zhuchl.spring.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import top.zhuchl.spring.entity.UserInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private NamedParameterJdbcTemplate jdbcTemplate;

    public void update(Map<String,Object> params) {
        String sql = "update user_info set salary = :salary where user_acco = :userAcco";
        jdbcTemplate.update(sql,params);
        logger.info("更新完毕");
    }

    public void updateEmail(Map<String,Object> params) {
        String sql = "update user_info set email = :email where user_acco = :userAcco";
        jdbcTemplate.update(sql,params);
        logger.info("更新完毕");
    }

    public List<UserInfo> findAll(){
        String sql = "SELECT * FROM user_info";
        List<UserInfo> resList = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(UserInfo.class));
        return resList;
    }

    public UserInfo findOne(String userAcco){
        String sql = "SELECT * FROM user_info WHERE user_acco = :userAcco";
        Map<String, Object> params = new HashMap<>();
        params.put("userAcco",userAcco);
        UserInfo userInfo = jdbcTemplate.queryForObject(sql,params,UserInfo.class);
        return userInfo;
    }
}
