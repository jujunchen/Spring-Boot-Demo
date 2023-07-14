package com.springboot.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.demo.model.TestDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper extends BaseMapper<TestDO> {
}
