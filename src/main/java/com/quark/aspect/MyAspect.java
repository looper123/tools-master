package com.quark.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by 311198 on 2017/2/23.
 */
@Aspect
@Component
public class MyAspect {

    @Pointcut("@annotation(com.quark.annotation.MyPointcut)")
    public void myAdvice(){
    }

    /**
     *
     * @param pjp  切入点信息
     * @return 被切入对象的返回值
     */
    @Around("myAdvice()")
    public Object myMethod(ProceedingJoinPoint pjp){
          Object obj =null;
//        System.out.println("mypointcut is running"+pjp);
        try {
//            执行目标方法后获取到的值 （一定要）
             obj = pjp.proceed();
            System.out.println("mypointcut is running"+pjp);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return obj;
    }


}
