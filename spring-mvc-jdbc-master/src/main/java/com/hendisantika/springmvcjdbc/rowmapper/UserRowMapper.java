package com.hendisantika.springmvcjdbc.rowmapper;

import com.hendisantika.springmvcjdbc.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created in Eclipse IDE.
 * Project : spring-mvc-jdbc-master
 * User: yash
 * Date: 18/01/2020
 */
public class UserRowMapper implements RowMapper<User> {

    public User mapRow(ResultSet rs, int row) throws SQLException {
        User userDetail = new User();
        userDetail.setId(rs.getInt("id"));
        userDetail.setFirstName(rs.getString("first_name"));
        userDetail.setLastName(rs.getString("last_name"));
        userDetail.setEmail(rs.getString("email"));
        userDetail.setDob(rs.getString("dob"));
        return userDetail;
    }
}
