package com.blog.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Description: 文章实体类
 * @Author : 王俊
 * @date :  2020/11/20
 */
@Data
@ToString
public class Article implements Serializable {

    private Integer id;         //文章主键
    private Integer articleId;  //文章id
    private String articleTitle;    //标题
    private Integer categoryId;//分类
    private Integer tagId;     //标签
    private String author;          //作者
    private String publishDate;     //发布文章日期
    private String articleContent;  //内容
    private Integer articleHits;        //阅读数
    private Integer articleComment;     //评论数
    private String articleDigest;     //摘要
    private Integer lastArticleId;      //上一篇文章id
    private Integer nextArticleId;      //下一篇文章id

    private Category category;
    private Tag tag;

}
