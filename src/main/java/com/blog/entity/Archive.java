package com.blog.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @Description: 归档实体
 * @Author : 王俊
 * @date :  2020/11/20
 */
@Data
@ToString
public class Archive {

    private String year;    //年份
    private String month;   //月份
    private String day;     //几号
    private String articleTitle;    //文章名称
    private Integer articleId;      //文章id

}
