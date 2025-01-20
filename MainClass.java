package com.jbk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jbk.Config.MyConfigClass;
import com.jbk.entity.MobileRecharge;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfigClass.class);
		MobileRecharge mb=context.getBean(MobileRecharge.class);
		//System.out.println("Your Recharge expiring soon...");
		mb.recharge();
		//System.out.println("recharge successfully...");
	}

}
