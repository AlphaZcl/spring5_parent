package top.zhuchl.spring.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import top.zhuchl.spring.entity.UserInfo;

import java.util.List;
import java.util.Map;

/**
 * 使用具名参数进行jdbcTemplate持久化操作
 *
 * @author zclys
 * @date 2020/9/27 16:04
 */
@Repository
public class UserNamedParamDao {

    private static final Logger logger = LoggerFactory.getLogger(UserNamedParamDao.class);

    @Autowired
    private NamedParameterJdbcTemplate namedJdbcTemplate;

    public void add(Map<String, Object> paramMap){
        String sql = "insert into user_info(user_acco,user_name,phone_no,email,salary) values(:userAcco,:userName,:phoneNo,:email,:salary)";
        namedJdbcTemplate.update(sql,paramMap);
        logger.info("添加数据完毕");
    }

    public void add(UserInfo userInfo){
        String sql = "insert into user_info(user_acco,user_name,phone_no,email,salary) values(:userAcco,:userName,:phoneNo,:email,:salary)";
        SqlParameterSource sqlParameterSource = new BeanPropertySqlParameterSource(userInfo);
        namedJdbcTemplate.update(sql,sqlParameterSource);
        logger.info("添加数据完毕");
    }

    public void update(UserInfo userInfo){
        String sql = "update user_info set user_name=:userName ,email=:email where user_acco=:userAcco";
        SqlParameterSource sqlParameterSource = new BeanPropertySqlParameterSource(userInfo);
        namedJdbcTemplate.update(sql,sqlParameterSource);
        logger.info("修改完毕");
    }

    public List<UserInfo> getUserInfo(UserInfo userinfo){
        String sql = "select * from user_info where phone_no = :phoneNo";
        SqlParameterSource sqlParameterSource = new BeanPropertySqlParameterSource(userinfo);
        List<UserInfo> reslist = namedJdbcTemplate.query(sql,sqlParameterSource,new BeanPropertyRowMapper<>(UserInfo.class));
        logger.info("查询完毕");
        return reslist;

    }

}
