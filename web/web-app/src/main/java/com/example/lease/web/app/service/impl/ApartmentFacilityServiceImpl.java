package com.example.lease.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.lease.model.entity.ApartmentFacility;
import com.example.lease.web.app.service.ApartmentFacilityService;
import com.example.lease.web.app.mapper.ApartmentFacilityMapper;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【apartment_facility(公寓&配套关联表)】的数据库操作Service实现
* @createDate 2025-04-11 11:12:39
*/
@Service
public class ApartmentFacilityServiceImpl extends ServiceImpl<ApartmentFacilityMapper, ApartmentFacility>
    implements ApartmentFacilityService{
}




