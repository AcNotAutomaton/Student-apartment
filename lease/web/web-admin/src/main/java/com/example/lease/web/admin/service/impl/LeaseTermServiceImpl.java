package com.example.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.lease.model.entity.LeaseTerm;
import com.example.lease.web.admin.service.LeaseTermService;
import com.example.lease.web.admin.mapper.LeaseTermMapper;
import org.springframework.stereotype.Service;

/**
* @author cly
* @description 针对表【lease_term(租期)】的数据库操作Service实现
* @createDate 2025--03-24 15:48:00
*/
@Service
public class LeaseTermServiceImpl extends ServiceImpl<LeaseTermMapper, LeaseTerm>
    implements LeaseTermService{

}




