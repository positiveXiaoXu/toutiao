package com.xugm.behavior.service;

import com.xugm.model.behavior.dtos.LikesBehaviorDto;
import com.xugm.model.common.dtos.ResponseResult;

public interface ApLikesBehaviorService {

    /**
     * 存储喜欢数据
     * @param dto
     * @return
     */
    public ResponseResult like(LikesBehaviorDto dto);
}
