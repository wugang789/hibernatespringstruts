package com.cn.intercepter;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class aroundIntercepter implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("ǰ ������������");
		 arg0.proceed();
		Object obj= arg0.getArguments().getClass().getCanonicalName();
		System.out.println(obj.toString());
		System.out.println("�󡣡���������");
		return obj;
	}
	
	

}
