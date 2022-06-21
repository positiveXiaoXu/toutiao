package com.xugm.behavior.service;

import com.xugm.model.behavior.dtos.ReadBehaviorDto;
import com.xugm.model.common.dtos.ResponseResult;

public interface ApReadBehaviorService {

    /**
     * 保存阅读行为
     * @param dto
     * @return
     */
    public ResponseResult readBehavior(ReadBehaviorDto dto);
}
