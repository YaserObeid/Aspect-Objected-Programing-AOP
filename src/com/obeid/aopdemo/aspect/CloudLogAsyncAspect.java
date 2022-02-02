package com.obeid.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


		@Aspect
		@Component
		public class CloudLogAsyncAspect {
			
		// will be applied on all methods exclude getter / setter
		
		@Before("com.obeid.aopdemo.aspect.AopExpression.forDaoPackageExeptGetterSetter()")
		public void logToCoud() {
			
			System.out.println("\n log to cloud @Before excuting!");
		}

}
