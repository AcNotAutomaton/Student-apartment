package com.example.lease.web.app.service;

public interface SmsService {
    void sendCode(String phone, String verifyCode);

}
