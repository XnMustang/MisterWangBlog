package com.blog.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @Description: 返回信息
 * @Author : 王俊
 * @date :  2020/11/26
 */
@Data
@ToString
public class Result {

    private String msg;
    private Integer code;

    public Result(String msg,Integer code){
        this.msg = msg;
        this.code = code;
    }

    public Result(String msg){
        this.msg = msg;
    }

    public Result(Integer code){
        this.code = code;
    }

}
