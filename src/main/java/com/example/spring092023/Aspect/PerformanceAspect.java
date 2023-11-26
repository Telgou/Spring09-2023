package com.example.spring092023.Aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class PerformanceAspect {


    @Before("execution(* com.example.spring092023.services.*.*(..)) && !@annotation(org.springframework.scheduling.annotation.Scheduled)")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Currently method " + name + " is being executed : ");
    }

    @Around("execution(* com.example.spring092023.services.*.*.*(..)) && !@annotation(org.springframework.scheduling.annotation.Scheduled)")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("Method execution time: " + elapsedTime + " milliseconds.");
        return obj;
    }


    @After("execution(* com.example.spring092023.services.*.*(..)) && !@annotation(org.springframework.scheduling.annotation.Scheduled)")
    public void logMethodExit(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Exiting method: " + name + " is finished ");
    }

    @AfterReturning(pointcut = "execution(* com.example.spring092023.services.*.*(..)) && !@annotation(org.springframework.scheduling.annotation.Scheduled)", returning = "result")
    public void logMethodReturn(JoinPoint joinPoint, Object result) {
        String name = joinPoint.getSignature().getName();
        log.info("Method " + name + " has been successfully executed. It has returned :  " + result);
    }

    @AfterThrowing(pointcut = "execution(* com.example.spring092023.services.*.*(..)) && !@annotation(org.springframework.scheduling.annotation.Scheduled)", throwing = "exception")
    public void logMethodThrowing(JoinPoint joinPoint, Throwable exception) {
        String name = joinPoint.getSignature().getName();
        log.info("Method " + name + " has thrown an exception " + exception.getMessage());
    }

}