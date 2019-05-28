package com.miaosha.service.impl;

import com.miaosha.dao.UserDOMapper;
import com.miaosha.dataobject.UserDO;
import com.miaosha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/3/24 0024.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDOMapper userDOMapper;

    @Override
    public UserDO getUserById(String id) {
        UserDO user =userDOMapper.selectByPrimaryKey(id);
        return user;
    }
}
