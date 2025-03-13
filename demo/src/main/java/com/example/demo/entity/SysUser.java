package com.example.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
@Data
@TableName("sys_user")
public class SysUser {
    //@TableField该注解用于处理 实体类字段与数据库表字段的映射规则
    //exist    标记非数据库字段（忽略字段）
    @ApiModelProperty("用户表")
    @TableField(exist=false)
    private List<SysUser> list;
    @TableId(type = IdType.AUTO)
    private Long id;
    @ApiModelProperty("用户名")
    @TableField(exist=false)
    private String userName;
    @ApiModelProperty("用户密码")
    @TableField(exist=false)
    private String password;
    @ApiModelProperty("权限id")
    @TableField(exist=false)
    private String loginType;
    @ApiModelProperty("手机号码")
    @TableField(exist=false)
    private String phone;
    @ApiModelProperty("部门id")
    @TableField(exist=false)
    private String deptId;
    @ApiModelProperty("部门名称")
    @TableField(exist=false)
    private String deptName;
    @ApiModelProperty("职务")
    @TableField(exist=false)
    private String duty;
    @ApiModelProperty("是否发送短信")
    @TableField(exist=false)
    private String duanxin;

}
