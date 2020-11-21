package com.blog.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Description:
 * @Author : 王俊
 * @date :  2020/11/20
 */
@Data
@ToString
public class Tag implements Serializable {

    private Integer id;     //主键自增
    private String tagName; //标签名称
    private String articleTitle;

}
