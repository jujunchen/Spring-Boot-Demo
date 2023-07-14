package com.springboot.demo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("test")
public class TestDO {
    private Integer id;

    private String name;
}
