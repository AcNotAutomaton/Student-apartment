package com.example.lease.web.admin.service;

import com.example.lease.model.entity.AttrKey;
import com.example.lease.web.admin.vo.attr.AttrKeyVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author cly
* @description 针对表【attr_key(房间基本属性表)】的数据库操作Service
* @createDate 2025--03-24 15:48:00
*/
public interface AttrKeyService extends IService<AttrKey> {

    List<AttrKeyVo> listAttrInfo();
}
