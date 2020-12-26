package com.realstate.usermodule.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Describe：用户操作类
 * @Author：luna
 * @Date：2020/12/25:21:10
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    @PostMapping(value = "/login")
    public String login () {
        return "success";
    }


}
