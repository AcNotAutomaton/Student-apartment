package com.example.lease.web.app.service.impl;

import com.example.lease.model.entity.ApartmentInfo;
import com.example.lease.model.entity.FacilityInfo;
import com.example.lease.model.entity.LabelInfo;
import com.example.lease.model.enums.ItemType;
import com.example.lease.web.app.mapper.*;
import com.example.lease.web.app.service.ApartmentInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.lease.web.app.service.LabelInfoService;
import com.example.lease.web.app.vo.apartment.ApartmentDetailVo;
import com.example.lease.web.app.vo.apartment.ApartmentItemVo;
import com.example.lease.web.app.vo.graph.GraphVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author liubo
 * @description 针对表【apartment_info(公寓信息表)】的数据库操作Service实现
 * @createDate 2025-04-11 11:12:39
 */
@Service
public class ApartmentInfoServiceImpl extends ServiceImpl<ApartmentInfoMapper, ApartmentInfo>
        implements ApartmentInfoService {

    @Autowired
    private ApartmentInfoMapper apartmentInfoMapper;

    @Autowired
    private LabelInfoMapper labelInfoMapper;

    @Autowired
    private GraphInfoMapper graphInfoMapper;

    @Autowired
    private RoomInfoMapper roomInfoMapper;

    @Override
    public ApartmentItemVo selectApartmentItemVoById(Long id) {

        ApartmentInfo apartmentInfo = apartmentInfoMapper.selectById(id);

        List<LabelInfo> labelInfoList = labelInfoMapper.selectListByApartmentId(id);

        List<GraphVo> graphVoList = graphInfoMapper.selectListByItemTypeAndId(ItemType.APARTMENT, id);

        BigDecimal minRent = roomInfoMapper.selectMinRentByApartmentId(id);

        ApartmentItemVo apartmentItemVo = new ApartmentItemVo();
        BeanUtils.copyProperties(apartmentInfo, apartmentItemVo);

        apartmentItemVo.setGraphVoList(graphVoList);
        apartmentItemVo.setLabelInfoList(labelInfoList);
        apartmentItemVo.setMinRent(minRent);
        return apartmentItemVo;
    }

    @Autowired
    private FacilityInfoMapper facilityInfoMapper;

    @Override
    public ApartmentDetailVo getApartmentDetailById(Long id) {
        //1.查询公寓信息
        ApartmentInfo apartmentInfo = apartmentInfoMapper.selectById(id);
        //2.查询图片信息
        List<GraphVo> graphVoList = graphInfoMapper.selectListByItemTypeAndId(ItemType.APARTMENT, id);
        //3.查询标签信息
        List<LabelInfo> labelInfoList = labelInfoMapper.selectListByApartmentId(id);
        //4.查询配套信息
        List<FacilityInfo> facilityInfoList = facilityInfoMapper.selectListByApartmentId(id);
        //5.查询最小租金
        BigDecimal minRent = roomInfoMapper.selectMinRentByApartmentId(id);

        ApartmentDetailVo apartmentDetailVo = new ApartmentDetailVo();

        BeanUtils.copyProperties(apartmentInfo, apartmentDetailVo);
        apartmentDetailVo.setGraphVoList(graphVoList);
        apartmentDetailVo.setLabelInfoList(labelInfoList);
        apartmentDetailVo.setFacilityInfoList(facilityInfoList);
        apartmentDetailVo.setMinRent(minRent);
        return apartmentDetailVo;
    }
}




