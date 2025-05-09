package com.example.lease.web.admin.mapper;

import com.example.lease.model.entity.RoomInfo;
import com.example.lease.web.admin.vo.room.RoomItemVo;
import com.example.lease.web.admin.vo.room.RoomQueryVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
* @author cly
* @description 针对表【room_info(房间信息表)】的数据库操作Mapper
* @createDate 2025-07-24 15:48:00
* @Entity com.example.lease.model.RoomInfo
*/
public interface RoomInfoMapper extends BaseMapper<RoomInfo> {

    IPage<RoomItemVo> pageRoomItemByQuery(IPage<RoomItemVo> page, RoomQueryVo queryVo);
}




