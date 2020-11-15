package com.yhk.mybatisplus2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yhk.mybatisplus2.core.domain.entity.UserRole;
import com.yhk.mybatisplus2.core.mapper.UserRoleMapper;
import com.yhk.mybatisplus2.service.IUserRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yhk
 * @since 2020-10-11
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
