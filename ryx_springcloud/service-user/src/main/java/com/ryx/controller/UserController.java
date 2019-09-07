package com.ryx.controller;

import com.ryx.entity.query.UserQuery;
import com.ryx.service.UserService;
import com.ryx.serviceinterface.pojo.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: ryx_springcloud
 *
 * @description:
 *
 * @author: renyuanxin
 *
 * @create: 2019-02-22 16:27
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping(value = "/{loginName}",method = RequestMethod.GET)
    public User getUser(@PathVariable String loginName){

        UserQuery querry = new UserQuery();
        querry.setLoginName(loginName);
        List<User> users = userService.findListByParam(querry);
        return  users.get(0);
    }
}
