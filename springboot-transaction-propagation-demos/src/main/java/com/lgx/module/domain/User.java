package com.lgx.module.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_user
 */
@TableName(value ="t_user")
@Data
public class User implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 年龄
     */
    @TableField(value = "age")
    private Integer age;

    /**
     * 部门ID
     */
    @TableField(value = "post_id")
    private Long postId;

    /**
     * 岗位ID
     */
    @TableField(value = "dept_id")
    private Long deptId;

    /**
     * 是否删除 1=删除 0=未删除
     */
    @TableLogic
    private Integer deleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}