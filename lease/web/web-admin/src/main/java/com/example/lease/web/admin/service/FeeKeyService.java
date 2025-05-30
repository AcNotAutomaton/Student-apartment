package com.example.lease.web.admin.service;

import com.example.lease.model.entity.FeeKey;
import com.example.lease.web.admin.vo.fee.FeeKeyVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author cly
* @description 针对表【fee_key(杂项费用名称表)】的数据库操作Service
* @createDate 2025-03-24 15:48:00
*/
public interface FeeKeyService extends IService<FeeKey> {
    List<FeeKeyVo> listFeeInfo();
}
