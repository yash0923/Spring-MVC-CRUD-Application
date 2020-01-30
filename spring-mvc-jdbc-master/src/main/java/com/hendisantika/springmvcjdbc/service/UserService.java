package com.hendisantika.springmvcjdbc.service;

import com.hendisantika.springmvcjdbc.entity.User;

import java.util.List;

/**
 * Created in Eclipse IDE.
 * Project : spring-mvc-jdbc-master
 * User: yash
 * Date: 18/01/2020
 */
public interface UserService {

    User getUserDetail(int id);

    List<User> getAllUserDetail();

    int addUserDetail(User userDetail);

    int updateUserDetail(User userDetail);

    int deleteUserDetail(int id);
}