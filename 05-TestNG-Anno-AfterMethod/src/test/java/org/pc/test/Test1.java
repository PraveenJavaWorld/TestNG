package org.pc.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method Annotation");
	}
	
	@Test
	public void test1() {
		System.out.println("Test Method 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test Method 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test Method 3");
	}

}
