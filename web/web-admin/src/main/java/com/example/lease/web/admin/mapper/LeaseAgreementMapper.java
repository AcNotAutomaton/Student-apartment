package com.example.lease.web.admin.mapper;

import com.example.lease.model.entity.LeaseAgreement;
import com.example.lease.web.admin.vo.agreement.AgreementQueryVo;
import com.example.lease.web.admin.vo.agreement.AgreementVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
* @author cly
* @description 针对表【lease_agreement(租约信息表)】的数据库操作Mapper
* @createDate 2025-07-24 15:48:00
* @Entity com.example.lease.model.LeaseAgreement
*/
public interface LeaseAgreementMapper extends BaseMapper<LeaseAgreement> {

    IPage<AgreementVo> pageAgreementByQuery(IPage<AgreementVo> page, AgreementQueryVo queryVo);
}




