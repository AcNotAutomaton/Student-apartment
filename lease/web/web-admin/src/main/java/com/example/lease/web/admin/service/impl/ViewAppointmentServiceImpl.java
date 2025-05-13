package com.example.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.lease.model.entity.ViewAppointment;
import com.example.lease.web.admin.mapper.ViewAppointmentMapper;
import com.example.lease.web.admin.service.ViewAppointmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.lease.web.admin.vo.appointment.AppointmentQueryVo;
import com.example.lease.web.admin.vo.appointment.AppointmentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cly
 * @description 针对表【view_appointment(预约看房信息表)】的数据库操作Service实现
 * @createDate 2025-03-24 15:48:00
 */
@Service
public class ViewAppointmentServiceImpl extends ServiceImpl<ViewAppointmentMapper, ViewAppointment>
        implements ViewAppointmentService {

    @Autowired
    private ViewAppointmentMapper viewAppointmentMapper;

    @Override
    public IPage<AppointmentVo> pageAppointmentByQuery(IPage<AppointmentVo> page, AppointmentQueryVo queryVo) {
        return viewAppointmentMapper.pageAppointmentByQuery(page, queryVo);
    }
}




