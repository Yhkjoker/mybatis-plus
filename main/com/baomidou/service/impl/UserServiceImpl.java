package com.baomidou.service.impl;

import com.baomidou.java.com.yhk.mybatisplus2.module.entity.User;
import com.baomidou.java.com.yhk.mybatisplus2.module.mapper.UserMapper;
import com.baomidou.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
