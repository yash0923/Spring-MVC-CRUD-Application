package com.hendisantika.springmvcjdbc.service;

import com.hendisantika.springmvcjdbc.dao.UserDao;
import com.hendisantika.springmvcjdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created in Eclipse IDE.
 * Project : spring-mvc-jdbc-master
 * User: yash
 * Date: 18/01/2020
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDetailDao;

    public User getUserDetail(int id) {
        return userDetailDao.getUserDetail(id);
    }

    public List<User> getAllUserDetail() {
        return userDetailDao.getAllUserDetail();
    }

    @Override
    public int addUserDetail(User userDetail) {
        return userDetailDao.addUserDetail(userDetail);
    }

    @Override
    public int updateUserDetail(User userDetail) {
        return userDetailDao.updateUserDetail(userDetail);
    }

    @Override
    public int deleteUserDetail(int id) {
        return userDetailDao.deleteUserDetail(id);
    }

    public UserDao getUserDetailDao() {
        return userDetailDao;
    }

}
