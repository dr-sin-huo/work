package com.shortrent.myproject.service;

import com.shortrent.myproject.generator.dao.UserDao;
import com.shortrent.myproject.generator.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public void saveUser(User user) {
        userDao.insert(user);
    }

    @Override
    public void deleteUser(Integer usrId) {
        userDao.deleteByPrimaryKey(usrId);
    }

    @Override
    public User getUser(Integer usrId) {
        return userDao.selectByPrimaryKey(usrId);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateByPrimaryKeySelective(user);
    }

    @Override
    public List<User> getAll() {
        List<User> users=userDao.selectByExample(null);
        return users;
    }
}
