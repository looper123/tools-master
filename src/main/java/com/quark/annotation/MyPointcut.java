package com.quark.annotation;

import java.lang.annotation.*;

/**
 * Created by 311198 on 2017/2/23.
 */
//注解作用在方法上
@Target(ElementType.METHOD)
//注解保留到jvm运行时
@Retention(RetentionPolicy.RUNTIME)
//这个注解应该被 javadoc工具记录
@Documented
public @interface MyPointcut {


}
