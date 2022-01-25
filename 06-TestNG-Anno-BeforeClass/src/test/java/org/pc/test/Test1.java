package org.pc.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Method");
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
