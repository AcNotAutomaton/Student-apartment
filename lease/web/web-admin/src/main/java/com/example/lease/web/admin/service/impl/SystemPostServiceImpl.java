package com.example.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.lease.model.entity.SystemPost;
import com.example.lease.web.admin.service.SystemPostService;
import com.example.lease.web.admin.mapper.SystemPostMapper;
import org.springframework.stereotype.Service;

/**
* @author cly
* @description 针对表【system_post(岗位信息表)】的数据库操作Service实现
* @createDate 2025--03-24 15:48:00
*/
@Service
public class SystemPostServiceImpl extends ServiceImpl<SystemPostMapper, SystemPost>
    implements SystemPostService{

}




