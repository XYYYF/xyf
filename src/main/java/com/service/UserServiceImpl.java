package com.service;

import com.dao.IUserDao;
import com.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return userDao.selectUser(userId);
    }
}
