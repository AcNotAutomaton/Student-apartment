package com.example.lease.web.admin.service;

import com.example.lease.model.entity.SystemUser;
import com.example.lease.web.admin.vo.system.user.SystemUserItemVo;
import com.example.lease.web.admin.vo.system.user.SystemUserQueryVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author cly
* @description 针对表【system_user(员工信息表)】的数据库操作Service
* @createDate 2025-03-24 15:48:00
*/
public interface SystemUserService extends IService<SystemUser> {

    IPage<SystemUserItemVo> pageSystemUserByQuery(IPage<SystemUser> page, SystemUserQueryVo queryVo);

    SystemUserItemVo getSystemUserById(Long id);
}
