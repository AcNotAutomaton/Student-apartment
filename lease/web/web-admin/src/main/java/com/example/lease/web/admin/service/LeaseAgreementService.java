package com.example.lease.web.admin.service;

import com.example.lease.model.entity.LeaseAgreement;
import com.example.lease.web.admin.vo.agreement.AgreementQueryVo;
import com.example.lease.web.admin.vo.agreement.AgreementVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author cly
* @description 针对表【lease_agreement(租约信息表)】的数据库操作Service
* @createDate 2025-03-24 15:48:00
*/
public interface LeaseAgreementService extends IService<LeaseAgreement> {

    IPage<AgreementVo> pageAgreementByQuery(IPage<AgreementVo> page, AgreementQueryVo queryVo);

    AgreementVo getAgreementById(Long id);
}
