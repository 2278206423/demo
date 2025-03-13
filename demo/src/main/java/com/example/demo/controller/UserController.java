package com.example.demo.controller;


import com.example.demo.entity.SysUser;
import com.example.demo.service.UserService;
import com.example.demo.until.AjaxType;
import org.apache.ibatis.annotations.ResultType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/use")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/findUser")
public AjaxType findUser (SysUser sysUser){
        List<SysUser> list=new ArrayList<>();
        list=userService.findUser(sysUser);

    return AjaxType.ok(list);
    }


}
