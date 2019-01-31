package com.cn.controller;

import com.cn.thrift.UserServiceProvider;
import com.cn.thrift.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zxoho
 * @date 19-1-28 上午11:30
 */

@Controller
@RequestMapping("/user")
public class UserServiceController {

    @Autowired
    private UserServiceProvider userServiceProvider;

    @GetMapping("/findOne")
    @ResponseBody
    public User findOne(@RequestParam("userId")String userId,
                        @RequestParam("companyId")String companyId) {
        try {
            User result =  userServiceProvider.getUserService().findOne(userId, companyId);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
