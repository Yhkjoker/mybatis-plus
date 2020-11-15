package com.yhk.mybatisplus2.module.service.impl;

import com.yhk.mybatisplus2.module.entity.User;
import com.yhk.mybatisplus2.module.mapper.UserMapper;
import com.yhk.mybatisplus2.module.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yhk
 * @since 2020-11-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
