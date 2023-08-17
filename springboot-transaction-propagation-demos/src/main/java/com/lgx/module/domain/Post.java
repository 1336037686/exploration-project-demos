package com.lgx.module.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_post
 */
@TableName(value ="t_post")
@Data
public class Post implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 岗位名称
     */
    @TableField(value = "post_name")
    private String postName;

    /**
     * 岗位编码
     */
    @TableField(value = "post_code")
    private String postCode;

    /**
     * 是否删除 1=删除 0=未删除
     */
    @TableLogic
    private Integer deleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}