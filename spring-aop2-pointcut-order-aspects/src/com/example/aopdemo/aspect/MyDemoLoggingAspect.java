package com.example.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.aopdemo.Account;

@Component
@Aspect
@Order(2)
public class MyDemoLoggingAspect {
	
	@Before("com.example.aopdemo.aspect.AopExpressions.forDaoPackageNoGetterSetter()")
	public void performLogging(JoinPoint theJoinpoint) {
		System.out.println("Logging is performed @before");
		MethodSignature methodsign = (MethodSignature) theJoinpoint.getSignature();
		System.out.println(methodsign);
		
		Object []args = theJoinpoint.getArgs();
		
		for(Object tempArg : args) {
			System.out.println(tempArg);
			
			if(tempArg instanceof Account) {
				Account theAccount = (Account) tempArg;
				System.out.println("name= "+theAccount.getName());
				System.out.println("level= "+theAccount.getLevel());
			}
		}
	}
}
