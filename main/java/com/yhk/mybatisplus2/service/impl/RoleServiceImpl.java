package com.yhk.mybatisplus2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yhk.mybatisplus2.core.domain.entity.Role;
import com.yhk.mybatisplus2.core.mapper.RoleMapper;
import com.yhk.mybatisplus2.service.IRoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
