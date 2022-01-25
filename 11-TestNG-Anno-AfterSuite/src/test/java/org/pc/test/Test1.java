package org.pc.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Test1 {
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite Method");
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
