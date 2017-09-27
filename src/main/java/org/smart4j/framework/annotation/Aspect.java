package org.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * Author： caoshengsheng
 * Date： 2017/9/25
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {

    Class<? extends Annotation> value();
}
