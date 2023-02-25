package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@TableName("habit")
@Data
public class Habit {
    @TableId(type = IdType.AUTO)
    private String id;
    @TableField(value = "name")
    private String name;
    @TableField(value = "type")
    private BigDecimal type;

}
