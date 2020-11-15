package com.yhk.mybatisplus2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yhk.mybatisplus2.core.domain.entity.User;
import com.yhk.mybatisplus2.core.mapper.UserMapper;
import com.yhk.mybatisplus2.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yhk
 * @since 2020-10-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUser() {
        return userMapper.getNames();
    }
}
