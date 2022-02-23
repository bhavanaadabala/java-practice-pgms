package com.mondee;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AuthLogAspect implements MethodInterceptor{
     public Object invoke(MethodInvocation  mi) throws Throwable {
		System.out.println("Authentication done");
		Object ob=mi.proceed();
		System.out.println("Logging information stored");
		return null;
	}
}