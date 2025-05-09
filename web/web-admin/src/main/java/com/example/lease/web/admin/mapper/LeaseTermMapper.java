package com.example.lease.web.admin.mapper;

import com.example.lease.model.entity.LeaseTerm;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author cly
* @description 针对表【lease_term(租期)】的数据库操作Mapper
* @createDate 2025-07-24 15:48:00
* @Entity com.example.lease.model.LeaseTerm
*/
public interface LeaseTermMapper extends BaseMapper<LeaseTerm> {

    List<LeaseTerm> selectListByRoomId(Long id);
}




