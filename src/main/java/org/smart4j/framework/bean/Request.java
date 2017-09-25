package org.smart4j.framework.bean;

import com.google.common.hash.HashCode;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Author： caoshengsheng
 * Date： 2017/9/25
 */
public class Request {

    private String requestMethod;
    private String requestPath;

    public Request(String requestMethod,String requestPath){
        this.requestMethod = requestMethod;
        this.requestPath = requestPath;
    }

    public String getRequestMethod(){
        return requestMethod;
    }

    public String getRequestPath(){
        return requestPath;
    }

    @Override
    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object obj){
        return EqualsBuilder.reflectionEquals(this,obj);
    }
}
