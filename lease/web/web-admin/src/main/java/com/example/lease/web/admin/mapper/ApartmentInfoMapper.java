package com.example.lease.web.admin.mapper;

import com.example.lease.model.entity.ApartmentInfo;
import com.example.lease.model.enums.LeaseStatus;
import com.example.lease.web.admin.vo.apartment.ApartmentItemVo;
import com.example.lease.web.admin.vo.apartment.ApartmentQueryVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
* @author cly
* @description 针对表【apartment_info(公寓信息表)】的数据库操作Mapper
* @createDate 2025-07-24 15:48:00
* @Entity com.example.lease.model.ApartmentInfo
*/
public interface ApartmentInfoMapper extends BaseMapper<ApartmentInfo> {

    IPage<ApartmentItemVo> pageApartmentItemByQuery(IPage<ApartmentItemVo> page, ApartmentQueryVo queryVo);
}




