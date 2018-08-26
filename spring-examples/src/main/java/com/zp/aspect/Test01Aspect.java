package com.zp.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Test01Aspect {


    @Pointcut("execution(* com.zp.aspect.*.*(..))")
    private void pointcutName(){

    }

    @After("pointcutName()")
    public void doAfter(JoinPoint jp) {
        System.out.println("log Ending method: "
                + jp.getTarget().getClass().getName() + "."
                + jp.getSignature().getName());
    }

    @Around("pointcutName()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        long time = System.currentTimeMillis();
        Object retVal = pjp.proceed();
        time = System.currentTimeMillis() - time;
        System.out.println("process time: " + time + " ms");
        return retVal;
    }

    @Before("pointcutName()")
    public void doBefore(JoinPoint jp) {
        System.out.println("log Begining method: "
                + jp.getTarget().getClass().getName() + "."
                + jp.getSignature().getName());
    }

    @AfterThrowing(value = "pointcutName()",throwing = "ex")
    public void doThrowing(JoinPoint jp, Throwable ex) {
        System.out.println("method " + jp.getTarget().getClass().getName()
                + "." + jp.getSignature().getName() + " throw exception");
        System.out.println(ex.getMessage());
    }

}
