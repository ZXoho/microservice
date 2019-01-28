package com.cn.service.impl;

import com.cn.dao.UserDao;
import com.cn.thrift.user.User;
import com.cn.thrift.user.UserService;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zxoho
 * @date 19-1-27 下午3:35
 */
@Service
public class UserServiceImpl implements UserService.Iface {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAllUsers(String companyId) throws TException {
        return userDao.findUsersByCompanyId(companyId);
    }

    @Override
    public User findOne(String userId, String companyId) throws TException {
        return userDao.findByCompanyIdAndUserId(companyId, userId);
    }

    @Override
    public void indexUser(User user) throws TException {
        userDao.save(user);
    }

    @Override
    public void deleteUser(String userId, String companyId) throws TException {
        userDao.deleteByCompanyIdAndUserId(companyId, userId);
    }
}
