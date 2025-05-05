package com.example.lease.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.lease.model.entity.FeeValue;
import com.example.lease.web.app.service.FeeValueService;
import com.example.lease.web.app.mapper.FeeValueMapper;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【fee_value(杂项费用值表)】的数据库操作Service实现
* @createDate 2025-04-11 11:12:39
*/
@Service
public class FeeValueServiceImpl extends ServiceImpl<FeeValueMapper, FeeValue>
    implements FeeValueService{

}




