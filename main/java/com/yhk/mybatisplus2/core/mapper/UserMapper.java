package com.yhk.mybatisplus2.core.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yhk.mybatisplus2.core.domain.entity.User;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Author yhk
 * @Date 2020/10/10 21:59
 * @Description
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> getNames();
}
