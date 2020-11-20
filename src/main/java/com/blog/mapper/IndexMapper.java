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

    @Select("select a.id,a.articleId,a.articleTitle,c.categoryName,t.tagName,a.author,\n" +
            "       a.publishDate,a.articleContent,a.articleHits,a.articleComment,a.articleDigest,\n" +
            "       a.lastArticleId,a.nextArticleId\n" +
            "from article As a " +
            "INNER JOIN category c on a.articleType = c.id " +
            "INNER JOIN tag t on a.articleTags = t.id;")
    List<Article> queryAllInfo();

}
