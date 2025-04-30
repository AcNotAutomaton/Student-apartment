package com.example.lease.web.admin.service;

import com.example.lease.model.entity.ViewAppointment;
import com.example.lease.web.admin.vo.appointment.AppointmentQueryVo;
import com.example.lease.web.admin.vo.appointment.AppointmentVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author cly
* @description 针对表【view_appointment(预约看房信息表)】的数据库操作Service
* @createDate 2025-03-24 15:48:00
*/
public interface ViewAppointmentService extends IService<ViewAppointment> {

    IPage<AppointmentVo> pageAppointmentByQuery(IPage<AppointmentVo> page, AppointmentQueryVo queryVo);
}
