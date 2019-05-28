package com.miaosha.controller;

import com.miaosha.dataobject.UserDO;
import com.miaosha.error.BusinessException;
import com.miaosha.error.EmBusinessError;
import com.miaosha.response.CommonReturnType;
import com.miaosha.service.UserService;
import com.miaosha.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2019/3/24 0024.
 */
@Controller("user")
@RequestMapping("/user")
public class UserController extends BaseController{

    @Autowired
    private UserService userService;

    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/get")
    @ResponseBody
    public CommonReturnType getUser(@RequestParam(name = "id") String id) throws BusinessException {
        UserDO userDO = userService.getUserById(id);

        if (userDO == null) {
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST);
        }
        return CommonReturnType.create(userDO);
    }

    @RequestMapping(value = "/all",method = RequestMethod.POST)
    @ResponseBody
    public String getUser() {
        UserDO user = userService.getUserById("E32391B2-738B-4186-A473-565F9CFD24A6");
        String name = user.getName();
        return name;
    }


}
