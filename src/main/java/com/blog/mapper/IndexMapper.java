package com.blog.mapper;

import com.blog.entity.Article;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
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

//    @Select("select a.id,a.articleId,a.articleTitle,c.categoryName,t.tagName,a.author,\n" +
//            "       a.publishDate,a.articleContent,a.articleHits,a.articleComment,a.articleDigest,\n" +
//            "       a.lastArticleId,a.nextArticleId\n" +
//            "from article As a " +
//            "INNER JOIN category c on a.articleType = c.id " +
//            "INNER JOIN tag t on a.articleTags = t.id;")
//    @Results(
//            id = "articleMap",
//            value = {
//                    @Result(id = true,column = "id",property = "id"),
//                    @Result(column = "articleId",property = "articleId"),
//                    @Result(column = "articleTitle",property = "articleTitle"),
//                    @Result(column = "articleType",property = "articleTypeName",one = @One(select = "com.blog.mapper.CategoryMapper.queryById",fetchType = FetchType.LAZY)),
//                    @Result(column = "articleTags",property = "articleTagName",one = @One(select = "com.blog.mapper.TagMapper.queryById",fetchType = FetchType.LAZY)),
//                    @Result(column = "author",property = "author"),
//                    @Result(column = "publishDate",property = "publishDate"),
//                    @Result(column = "articleContent",property = "articleContent"),
//                    @Result(column = "articleHits",property = "articleHits"),
//                    @Result(column = "articleComment",property = "articleComment"),
//                    @Result(column = "articleDigest",property = "articleDigest"),
//                    @Result(column = "lastArticleId",property = "lastArticleId"),
//                    @Result(column = "nextArticleId",property = "nextArticleId"),
//            }
//    )
    List<Article> queryAllInfo();

}
