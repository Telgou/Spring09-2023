package com.example.spring092023.Aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j

public class ScheduledAspect {
    @Before("@annotation(org.springframework.scheduling.annotation.Scheduled)")
    public void logScheduledMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Scheduled method " + name + " is about to be executed : ");
    }

    @Around("@annotation(org.springframework.scheduling.annotation.Scheduled)")
    public Object profileScheduled(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("Scheduled method execution time: " + elapsedTime + " milliseconds.");
        return obj;
    }

    @After("@annotation(org.springframework.scheduling.annotation.Scheduled)")
    public void logScheduledMethodExit(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Scheduled method " + name + " has finished execution.");
    }

    @AfterReturning(pointcut = "@annotation(org.springframework.scheduling.annotation.Scheduled)", returning = "result")
    public void logScheduledMethodReturn(JoinPoint joinPoint, Object result) {
        String name = joinPoint.getSignature().getName();
        log.info("Scheduled method " + name + " has been successfully executed.");
    }

    @AfterThrowing(pointcut = "@annotation(org.springframework.scheduling.annotation.Scheduled)", throwing = "exception")
    public void logScheduledMethodThrowing(JoinPoint joinPoint, Throwable exception) {
        String name = joinPoint.getSignature().getName();
        log.info("Scheduled method " + name + " has thrown an exception: " + exception.getMessage());
    }
}
