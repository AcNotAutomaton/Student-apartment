package com.example.lease.web.admin.mapper;

import com.example.lease.model.entity.AttrValue;
import com.example.lease.web.admin.vo.attr.AttrValueVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author cly
* @description 针对表【attr_value(房间基本属性值表)】的数据库操作Mapper
* @createDate 2025-07-24 15:48:00
* @Entity com.example.lease.model.AttrValue
*/
public interface AttrValueMapper extends BaseMapper<AttrValue> {

    List<AttrValueVo> selectListByRoomId(Long id);
}




