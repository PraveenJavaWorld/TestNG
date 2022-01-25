package org.pc.test;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.Test;

public class Test1 {
	
	@AfterGroups(value = "Test1")
	public void afterGroups() {
		System.out.println("After Groups Annotation");
	}
	
	@Test
	public void test1() {
		System.out.println("Test Method 1");
	}
	
	@Test(groups = {"Test1"})
	public void test2() {
		System.out.println("Test Method 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test Method 3");
	}
	@Test(groups = {"Test1"})
	public void test4() {
		System.out.println("Test Method 4");
	}
	
	@Test
	public void test5() {
		System.out.println("Test Method 5");
	}
	
	@Test(groups = {"Test1"})
	public void test6() {
		System.out.println("Test Method 6");
	}

}
