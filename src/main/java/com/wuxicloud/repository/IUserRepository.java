package com.wuxicloud.repository;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wuxicloud.model.User;

/**
 * Created by EalenXie on 2023/3/22 15:35
 */
public interface IUserRepository extends IService<User> {

    User findByUsername(String username);
}
