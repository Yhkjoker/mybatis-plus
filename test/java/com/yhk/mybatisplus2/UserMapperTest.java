package com.yhk.mybatisplus2;

import com.yhk.mybatisplus2.core.domain.entity.User;
import com.yhk.mybatisplus2.core.mapper.UserMapper;
import com.yhk.mybatisplus2.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @ClassName UserMapperTest
 * @Author yhk
 * @Date 2020/10/10 22:22
 * @Description
 */
@SpringBootTest(classes = MybatisPlus2Application.class)
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserServiceImpl userService;

    @Test
    public void userTest() {
        List<User> users = userMapper.selectList(null);
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void serviceTest(){
        List<User> user = userService.getUser();
        System.out.println(user.toString());

        List<User> userList = userService.getUser();
        System.out.println(userList.toString());
    }
}
