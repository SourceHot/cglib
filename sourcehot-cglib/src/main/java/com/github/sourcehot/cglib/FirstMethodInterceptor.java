package com.github.sourcehot.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class FirstMethodInterceptor implements MethodInterceptor {
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

		if (method != null) {
			System.out.println("当前正在执行的方法是:" + method.getName());
		}

		return proxy.invokeSuper(obj, args);
	}
}
