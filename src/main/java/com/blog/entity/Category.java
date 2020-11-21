package com.blog.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Description: 分类实体
 * @Author : 王俊
 * @date :  2020/11/20
 */
@Data
@ToString
public class Category implements Serializable {

    private Integer id;     //主键自增
    private String categoryName;    //分类类名
    private Integer categoryCount;  //统计

}
