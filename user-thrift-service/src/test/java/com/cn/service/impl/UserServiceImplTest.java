package com.cn.service.impl;

import com.cn.dao.UserDao;
import com.cn.thrift.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author zxoho
 * @date 19-1-29 上午11:20
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceImplTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void findAllUsers() {
    }

    @Test
    public void findOne() {
        User result = userDao.findOne("5133101501");
        System.out.println(result);
    }

    @Test
    public void indexUser() {
    }

    @Test
    public void deleteUser() {
    }
}