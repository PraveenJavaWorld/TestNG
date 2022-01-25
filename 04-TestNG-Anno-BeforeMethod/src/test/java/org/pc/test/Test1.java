package org.pc.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method Annotation");
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
