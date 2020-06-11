package com.atguigu.springcloud.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Payment)实体类
 *
 * @author makejava
 * @since 2020-06-11 09:12:34
 */
@Data
public class Payment implements Serializable {
    private static final long serialVersionUID = 533084232244532648L;
    
    private Integer id;
    
    private String serial;
}