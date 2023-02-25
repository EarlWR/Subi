package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.demo.commom.Result;
import com.example.demo.entity.Habit;
import com.example.demo.mapper.HabitMapper;
import com.example.demo.utils.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habit")
public class HabitController {
    @Autowired
    private HabitMapper habitMapper;

    /**
     * 获取所有的日常行为的habit信息
     * @return 日常行为
     */
    @PostMapping("/getAllDailyActionData")
    private AjaxResult getAllDailyActionData() {
        return AjaxResult.success(habitMapper.selectList(new LambdaQueryWrapper<Habit>().eq(Habit::getType, "1")));
    }
}
