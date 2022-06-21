package com.xugm.wemedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xugm.model.common.dtos.ResponseResult;
import com.xugm.model.wemedia.dtos.WmNewsDto;
import com.xugm.model.wemedia.dtos.WmNewsPageReqDto;
import com.xugm.model.wemedia.pojos.WmNews;

public interface WmNewsService extends IService<WmNews> {

    /**
     * 条件查询文章列表
     * @param dto
     * @return
     */
    public ResponseResult findList(WmNewsPageReqDto dto);

    /**
     * 发布修改文章或保存为草稿
     * @param dto
     * @return
     */
    public ResponseResult submitNews(WmNewsDto dto);

    /**
     * 文章的上下架
     * @param dto
     * @return
     */
    public ResponseResult downOrUp(WmNewsDto dto);


}
