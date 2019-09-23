package com.icecream.ww;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BasciAnnotation {

	@Test
	public void testCase1() {
		System.out.println("test这是测试用例一");
	}

	@Test
	public void testCase2() {
		System.out.println("test这是测试用例二");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforemethod这是在测试方法之前运行的");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("aftermethod这是在测试方法之后运行的");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeclass这是在类运行之前执行的方法");
		
	}
	@AfterClass
	public void afterClass() {
		System.out.println("afterclass这是在类之后运行的方法");
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("beforesuite测试套件");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite测试套件");
	}
}
