package com.xugm.apis.article.fallback;

import com.xugm.apis.article.IArticleClient;
import com.xugm.model.article.dtos.ArticleDto;
import com.xugm.model.common.dtos.ResponseResult;
import com.xugm.model.common.enums.AppHttpCodeEnum;
import org.springframework.stereotype.Component;

@Component
public class IArticleClientFallback implements IArticleClient {
    @Override
    public ResponseResult saveArticle(ArticleDto dto) {
        return ResponseResult.errorResult(AppHttpCodeEnum.SERVER_ERROR,"获取数据失败");
    }
}
