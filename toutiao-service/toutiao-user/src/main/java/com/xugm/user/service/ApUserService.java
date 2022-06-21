package com.xugm.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xugm.model.common.dtos.ResponseResult;
import com.xugm.model.user.dtos.LoginDto;
import com.xugm.model.user.pojos.ApUser;

public interface ApUserService extends IService<ApUser> {
    /**
     * app端登录功能
     * @param dto
     * @return
     */
    public ResponseResult login(LoginDto dto);
}
