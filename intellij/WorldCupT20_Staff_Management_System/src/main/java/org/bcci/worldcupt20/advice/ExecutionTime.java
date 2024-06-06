package org.bcci.worldcupt20.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTime {

    private static final Logger logger = LoggerFactory.getLogger(ExecutionTime.class);

    private long startTime;

    @Before("execution(* org.bcci.worldcupt20.dao.StaffDao.getAllStaff())")
    public void beforeGetAllStaff(JoinPoint joinPoint) {
        startTime = System.currentTimeMillis();
        logger.info("Execution of {} started.",joinPoint.getSignature().getName());
    }

    @After("execution(* org.bcci.worldcupt20.dao.StaffDao.getAllStaff())")
    public void afterGetAllStaff(JoinPoint joinPoint) {
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        logger.info("Execution of {} completed. Duration: {} ms",joinPoint.getSignature().getName(), duration);
    }
}
