package org.pc.test;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeGroups(groups = "Test1")
	public void beforeGroups() {
		System.out.println("Before Groups Annotation");
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
	
	@Test(groups = {"Test1"})
	public void test5() {
		System.out.println("Test Method 5");
	}
	
	@Test(groups = {"Test1"})
	public void test6() {
		System.out.println("Test Method 6");
	}

}
