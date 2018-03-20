package com.quark.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * Created by zebon lu on 2017/6/26.
 */
@Retention(RetentionPolicy.RUNTIME)//保留到运行时
@Target({FIELD, TYPE,METHOD})//注解的作用域
@Documented //被java doc工具记录
public @interface ConvertToChinese {

     String  jsonString() default "" ;

     String  FieldName() default  "";

}
