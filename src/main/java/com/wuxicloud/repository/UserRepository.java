package com.wuxicloud.repository;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuxicloud.dao.UserMapper;
import com.wuxicloud.model.User;
import org.springframework.stereotype.Service;


/**
 * Created by EalenXie on 2023/3/22 15:37
 */
@Service
public class UserRepository extends ServiceImpl<UserMapper, User> implements IUserRepository {


    public User findByUsername(String username) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getUsername, username);
        wrapper.last("limit 1");
        return getOne(wrapper);
    }
}
