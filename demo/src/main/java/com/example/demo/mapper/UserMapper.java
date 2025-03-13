package com.example.demo.mapper;

import com.example.demo.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
public interface UserMapper {
//    @Select("${sql}")
    List<SysUser> findUser(@Param("id")Long id);
}
