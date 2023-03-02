package com.springboot.demo;

import org.springframework.boot.task.TaskSchedulerBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

// 5.7 任务执行和调度
//    @Resource
//    private TaskSchedulerBuilder taskSchedulerBuilder;

    @GetMapping("index")
    public String index(@RequestParam("id") String d) {
        return "Hello World!" + d;
    }

}
