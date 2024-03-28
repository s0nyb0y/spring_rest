package com.radik.spring_rest.lesson4.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAroundAspectAdvice {
    @Around("execution(* com.radik.spring_rest.lesson4.dao.*.*())")
    public Object myAroundAspectAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String methodName = methodSignature.getName();
        System.out.println("before of " + methodName);
        Object targetMethodResult = proceedingJoinPoint.proceed();
        System.out.println("end of " + methodName);
        return targetMethodResult;
    }
}
