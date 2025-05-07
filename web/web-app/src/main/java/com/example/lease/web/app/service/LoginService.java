package com.example.lease.web.app.service;

import com.example.lease.web.app.vo.user.LoginVo;
import com.example.lease.web.app.vo.user.UserInfoVo;

public interface LoginService {

    void getSMSCode(String phone);

    String login(LoginVo loginVo);

    UserInfoVo getUserInfoById(Long userId);
}
