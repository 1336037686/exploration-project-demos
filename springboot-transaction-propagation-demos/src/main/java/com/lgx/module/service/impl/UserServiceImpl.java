package com.lgx.module.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lgx.module.domain.User;
import com.lgx.module.service.UserService;
import com.lgx.module.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 13360
* @description 针对表【t_user】的数据库操作Service实现
* @createDate 2023-08-17 16:14:47
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




