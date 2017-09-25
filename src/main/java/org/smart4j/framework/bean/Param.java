package org.smart4j.framework.bean;

import java.util.Map;

/**
 * Author： caoshengsheng
 * Date： 2017/9/25
 */
public class Param {

    private Map<String,Object> paramMap;

    public Param(Map<String,Object> paramMap){
        this.paramMap = paramMap;
    }

    public long getLong(String name){
        return Long.parseLong(paramMap.get(name).toString());
    }

    public Map<String,Object> getMap(){
        return paramMap;
    }
}
