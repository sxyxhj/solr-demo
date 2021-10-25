package org.sxyxhj.solrdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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


    @PostMapping("/api/addUser")
    public boolean addUser(@RequestBody User user){
        return service.addUser(user);
    }

    @PutMapping("/api/deleteUserById/{id}")
    public boolean deleteUserById(@PathVariable("id") int id){
        return service.deleteUserById(id);
    }

    @PostMapping("/api/updateUser")
    public boolean updateUser(@RequestBody User user){
        return service.updateUser(user);
    }


}

    
