package org.sxyxhj.solrdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.sxyxhj.solrdemo.entity.User;
import org.sxyxhj.solrdemo.service.UserService;

/**
 * @program: solr-demo
 * @description: 用户 controller
 * @author: @sxyxhj
 * @create: 2021-10-24 11:49
 **/
@RestController
public class UserController {

    @Autowired
    UserService service;

    @GetMapping("/api/getUserById/{id}")
    public User getUserById(@PathVariable("id") int id){
        return service.getUserById(id);
    }


}

    
