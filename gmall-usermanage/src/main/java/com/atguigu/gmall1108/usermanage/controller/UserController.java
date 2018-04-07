package com.atguigu.gmall1108.usermanage.controller;

import com.atguigu.gmall1108.usermanage.bean.UserInfo;
import com.atguigu.gmall1108.usermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("userList")
    public ResponseEntity<List<UserInfo>> userList(){
        List<UserInfo> userInfoListAll = userService.getUserInfoListAll();

        return  ResponseEntity.ok(userInfoListAll);

    }



}
