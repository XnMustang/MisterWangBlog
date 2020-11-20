package com.blog.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @Description: 文章实体类
 * @Author : 王俊
 * @date :  2020/11/20
 */
@Data
@ToString
public class Article {

    private int id;         //文章主键
    private int articleId;  //文章id
    private String articleTitle;    //标题
    private String articleType;     //分类
    private String articleTags;     //标签
    private String author;          //作者
    private String publishDate;     //发布文章日期
    private String articleContent;  //内容
    private int articleHits;        //阅读数
    private int articleComment;     //评论数
    private String articleDigest;     //摘要
    private int lastArticleId;      //上一篇文章id
    private int nextArticleId;      //下一篇文章id
    private Date gmtCreate;         //创建时间
    private Date gmtModified;         //更新时间

}
