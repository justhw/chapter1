package org.smart4j.framework.helper;

import org.smart4j.framework.annotation.Inject;
import org.smart4j.framework.util.ReflectionUtil;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * Author： caoshengsheng
 * Date： 2017/9/25
 */
public final class IoCHelper {

    static {
        System.out.println("---------------------------------------start IoCHelper");
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
        if (!CollectionUtils.isEmpty(beanMap)) {
            for (Map.Entry<Class<?>, Object> beanEntry : beanMap.entrySet()) {
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                Field[] beanFields = beanClass.getDeclaredFields();
                for (Field beanField : beanFields) {
                    if (beanField.isAnnotationPresent(Inject.class)) {
                        Class<?> beanFiledClass = beanField.getType();
                        Object beanFieldInstance = beanMap.get(beanFiledClass);
                        if (beanFieldInstance != null) {
                            ReflectionUtil.setField(beanInstance, beanField, beanFieldInstance);
                        }
                    }
                }
            }
        }
    }
}
