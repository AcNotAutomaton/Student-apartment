package com.example.lease.web.admin.mapper;

import com.example.lease.model.entity.FacilityInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author cly
* @description 针对表【facility_info(配套信息表)】的数据库操作Mapper
* @createDate 2025-07-24 15:48:00
* @Entity com.example.lease.model.FacilityInfo
*/
public interface FacilityInfoMapper extends BaseMapper<FacilityInfo> {

    List<FacilityInfo> selectListByApartmentId(Long id);

    List<FacilityInfo> selectListByRoomId(Long id);
}




