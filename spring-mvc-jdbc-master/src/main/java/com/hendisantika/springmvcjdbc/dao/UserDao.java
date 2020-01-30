package com.hendisantika.springmvcjdbc.dao;

import com.hendisantika.springmvcjdbc.entity.User;

import java.util.List;

/**
 * Created in Eclipse IDE.
 * Project : spring-mvc-jdbc-master
 * User: yash
 * Date: 18/01/2020
 */
public interface UserDao {

    User getUserDetail(int id);

    List<User> getAllUserDetail();

    int addUserDetail(User userDetail);

    int updateUserDetail(User userDetail);

    int deleteUserDetail(int id);

}