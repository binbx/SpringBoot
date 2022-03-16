package com.binbx.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.binbx.admin.bean.User;
import com.binbx.admin.mapper.UserMapper;
import com.binbx.admin.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @ClassName: UserServiceImpl
 * @Author: bxie
 * @Date: 2022/3/15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
