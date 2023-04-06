package com.UST.userservice.controller;

import com.UST.userservice.VO.ResponseTemplateVo;
import com.UST.userservice.entity.User;
import com.UST.userservice.service.UserServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserServices userservice;
    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("inside saveUser of UserController");
        return userservice.saveUser(user);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVo getUserwithDepartment(@PathVariable("id") Long userId){
        log.info("inside getUserwithDepartent  of UserController");
        return userservice.getUserwithDepartment(userId);
    }


}
