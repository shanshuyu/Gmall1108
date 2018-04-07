package com.atguigu.gmall1108.usermanage.service.impl;

import com.atguigu.gmall1108.usermanage.bean.UserInfo;
import com.atguigu.gmall1108.usermanage.mapper.UserInfoMapper;
import com.atguigu.gmall1108.usermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;

    public List<UserInfo> getUserInfoListAll(){

        return  userInfoMapper.selectAll();
    }


}
