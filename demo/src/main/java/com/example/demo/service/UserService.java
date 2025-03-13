package com.example.demo.service;

import com.example.demo.entity.SysUser;

import java.util.List;

public interface UserService {
    List<SysUser> findUser(SysUser sysUser);

}
