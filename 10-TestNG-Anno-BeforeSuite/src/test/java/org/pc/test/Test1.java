package org.pc.test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite Method");
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
