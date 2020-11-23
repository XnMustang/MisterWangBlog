package com.blog.utils.map;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @Description:
 * @Author : 王俊
 * @date :  2020/11/23
 */
public class LinkedMultiValueMap<K,V> extends BasicMultiValueMap<K, V>{

    public LinkedMultiValueMap() {
        super(new LinkedHashMap<K,List<V>>());
    }

}
