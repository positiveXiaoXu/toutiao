package com.xugm.user.service;


import com.xugm.model.common.dtos.ResponseResult;
import com.xugm.model.user.dtos.UserRelationDto;



public interface ApUserRelationService {
    /**
     * 用户关注/取消关注
     * @param dto
     * @return
     */
    public ResponseResult follow(UserRelationDto dto);
}