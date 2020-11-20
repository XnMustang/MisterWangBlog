package com.blog.mapper;

import com.blog.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: 首页信息dao层
 * @Author : 王俊
 * @date :  2020/11/20
 */
@Mapper
@Repository
public interface IndexMapper {

    @Select("select a.id,a.articleId,a.articleTitle,a.articleType,a.articleTags,a.author,\n" +
            "       a.publishDate,a.articleContent,a.articleHits,a.articleComment,a.articleDigest,\n" +
            "       a.lastArticleId,a.nextArticleId,a.gmtCreate,a.gmtModified\n" +
            "from article As a;")
    List<Article> queryAllInfo();

}
