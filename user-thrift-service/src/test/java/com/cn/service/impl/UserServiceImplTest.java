package com.cn.service.impl;

import com.cn.dao.UserDao;
import com.cn.thrift.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author zxoho
 * @date 19-2-2 下午9:24
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceImplTest {

    private UserDao userDao;

    @Test
    public void findAllUsers() {

        List<User> result = userDao.findUsersByCompanyId("5133");
        System.out.println(result);
    }
}