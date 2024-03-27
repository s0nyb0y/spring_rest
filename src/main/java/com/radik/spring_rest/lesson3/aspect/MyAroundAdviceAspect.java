package com.radik.spring_rest.lesson3.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAroundAdviceAspect {
    @Around("execution(* com.radik.spring_rest.lesson3.dao.*.*(..))")
    public Object myAroundAdviceAspect(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String methodName = methodSignature.getName();
        System.out.println("before of " + methodName);
        Object targetMethodResult = proceedingJoinPoint.proceed();
        System.out.println("end of " + methodName);
        return targetMethodResult;
    }
}
