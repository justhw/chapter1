package org.smart4j.framework.bean;

import java.lang.reflect.Method;

/**
 * Author： caoshengsheng
 * Date： 2017/9/25
 */
public class Handler {

    private Class<?> controllerClass;

    private Method actionMethod;

    public Handler(Class<?> controllerClass,Method actionMethod){
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }


    public Class<?> getControllerClass() {
        return controllerClass;
    }

    public Method getActionMethod() {
        return actionMethod;
    }
}
