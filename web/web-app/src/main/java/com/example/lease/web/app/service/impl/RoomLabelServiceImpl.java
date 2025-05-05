package com.example.lease.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.lease.model.entity.RoomLabel;
import com.example.lease.web.app.service.RoomLabelService;
import com.example.lease.web.app.mapper.RoomLabelMapper;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【room_label(房间&标签关联表)】的数据库操作Service实现
* @createDate 2025-04-11 11:12:39
*/
@Service
public class RoomLabelServiceImpl extends ServiceImpl<RoomLabelMapper, RoomLabel>
    implements RoomLabelService{

}




