package com.xugm.es.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xugm.es.pojo.SearchArticleVo;
import com.xugm.model.article.pojos.ApArticle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApArticleMapper extends BaseMapper<ApArticle> {

    public List<SearchArticleVo> loadArticleList();

}
