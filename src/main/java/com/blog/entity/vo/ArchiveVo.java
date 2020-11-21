package com.blog.entity.vo;

import lombok.Data;
import lombok.ToString;

/**
 * @Description:
 * @Author : 王俊
 * @date :  2020/11/20
 */
@Data
@ToString
public class ArchiveVo {

    private String articleTitle;    //文章名
    private String years;   //年月
    private Integer articleCount;   //不同月份统计
    private Integer monthDay;       //月日

}
