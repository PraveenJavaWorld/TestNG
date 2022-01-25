package org.pc.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Test2 {
	
	@AfterClass
	public void afterClass() {
		System.out.println("Test 2 Class After Class Method");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 2 Class Test Method 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2 Class Test Method 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test 2 Class Test Method 3");
	}

}
