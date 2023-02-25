package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.math.BigDecimal;

@TableName("material")
@Data
public class Material {
    @TableId(type = IdType.AUTO)
    private String id;
    @TableField(value = "name")
    private String name;
    @TableField(value = "property")
    private String property;
    @TableField(value = "value")
    private BigDecimal value;
}
