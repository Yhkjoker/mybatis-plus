package com.yhk.mybatisplus2.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yhk.mybatisplus2.core.domain.entity.User;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author yhk
 * @since 2020-10-11
 */
public interface IUserService extends IService<User> {

    List<User> getUser();

}
