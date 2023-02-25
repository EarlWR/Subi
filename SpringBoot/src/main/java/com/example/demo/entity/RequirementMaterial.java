package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@TableName("requirement_material")
@Data
public class RequirementMaterial {
    @TableId(type = IdType.AUTO)
    private String id;
    @TableField(value = "habit_id")
    private String habitId;
    @TableField(value = "material_id")
    private String materialId;
    @TableField(value = "value")
    private BigDecimal value;
}
