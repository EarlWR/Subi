package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Habit;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HabitMapper extends BaseMapper<Habit> {
}
