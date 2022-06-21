package com.xugm.search.service;

import com.xugm.model.common.dtos.ResponseResult;
import com.xugm.model.search.dtos.UserSearchDto;

public interface ApAssociateWordsService {

    /**
     * 搜索联想词
     * @param dto
     * @return
     */
    public ResponseResult search(UserSearchDto dto);
}
