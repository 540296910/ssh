package com.spring.aop;  

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.toceansoft.entity.Cdsgus;

/** 
 * 切面 
 * 
 */  
public class TestAspect {  
 private JoinPoint jp;
    public void doAfter(Cdsgus cd) { 
    	System.out.println("after");
        System.out.println(cd.getName());
    }  
  
    public Object doAround(ProceedingJoinPoint pjp,Cdsgus cd) throws Throwable {  
        long time = System.currentTimeMillis();  
        System.out.println(cd.getVersion());
        System.out.println("process time: " + time + " ms");
        Object retVal = pjp.proceed();  
        time = System.currentTimeMillis();
        System.out.println(cd.getVersion());
        System.out.println("process time: " + time + " ms");  
        return retVal;  
    }  
  
    public void doBefore(Cdsgus cd) {  
    	System.out.println(cd.getName());
    	System.out.println("AOP before test"); 
    
    }  
  /*
    public void doThrowing(JoinPoint jp, Throwable ex) {  
        System.out.println("method " + jp.getTarget().getClass().getName()  
                + "." + jp.getSignature().getName() + " throw exception");  
        System.out.println(ex.getMessage());  
    }  
  */
    private void sendEx(String ex) {  
        //TODO 发送短信或邮件提醒  
    }  
}   