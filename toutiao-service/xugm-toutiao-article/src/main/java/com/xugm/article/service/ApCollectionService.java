package com.xugm.article.service;

import com.xugm.model.article.dtos.CollectionBehaviorDto;
import com.xugm.model.common.dtos.ResponseResult;

public interface ApCollectionService {

    /**
     * 收藏
     * @param dto
     * @return
     */
    public ResponseResult collection(CollectionBehaviorDto dto);
}
