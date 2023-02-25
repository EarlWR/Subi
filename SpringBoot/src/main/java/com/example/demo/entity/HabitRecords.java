package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@TableName("habitRecords")
@Data
public class HabitRecords {
    @TableId(type = IdType.AUTO)
    private String id;
    @TableField(value = "student_id")
    private String studentId;
    @TableField(value = "habit_id")
    private String habitId;
    @TableField(value = "student_name")
    private String studentName;
    @TableField(value = "student_sex")
    private String studentSex;
    @TableField(value = "student_age")
    private String studentAge;
    @TableField(value = "student_class")
    private String studentClass;
    @TableField(value = "time")
    private BigDecimal time;
}
