package com.jbk.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MessageAspects {
	
	//@Before("execution (public void recharge())")
	//public void beforeMSG() {
	//	System.out.println("Your recharhe is expiring soon");
	//}
	
	//@After("execution( public void recharge())")
	//public void afterMSG() {
	//	System.out.println("enjoy your data pack");
	//}

	@Around("execution (* com.jbk.entity.MobileRecharge.*())")
	public void aroundMSG(ProceedingJoinPoint pj) {
		System.out.println("your recharge is expiring soon...");
		
		try {
			pj.proceed();
		}catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println("enjoy your data pack...");
		
		
	}
}
