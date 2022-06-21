package com.xugm.wemedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xugm.model.common.dtos.ResponseResult;
import com.xugm.model.wemedia.dtos.WmLoginDto;
import com.xugm.model.wemedia.pojos.WmUser;

public interface WmUserService extends IService<WmUser> {

    /**
     * 自媒体端登录
     * @param dto
     * @return
     */
    public ResponseResult login(WmLoginDto dto);

}