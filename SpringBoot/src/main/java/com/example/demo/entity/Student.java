package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("student")
@Data

public class Student {
    @TableId(type = IdType.AUTO)
    private String id;
    @TableField(value = "name")
    private String name;
    @TableField(value = "sex")
    private String sex;
    @TableField(value = "age")
    private String age;
    @TableField(value = "class")
    private String className;
}
