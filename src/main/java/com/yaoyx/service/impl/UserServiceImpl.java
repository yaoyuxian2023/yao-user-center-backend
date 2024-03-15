package com.yaoyx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yaoyx.model.domain.User;
import com.yaoyx.service.UserService;
import com.yaoyx.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Augus
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2024-03-15 16:49:06
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




