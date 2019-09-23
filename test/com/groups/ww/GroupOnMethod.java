package com.groups.ww;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {

	@Test(groups = "server")
	public void test1() {
		System.out.println("这是服务端的测试组1111！");
	}
	@Test(groups = "server")
	public void test2() {
		System.out.println("这是服务端的测试组22222！");
	}
	@Test(groups = "client")
	public void test3() {
		System.out.println("这是客户端的测试组3333！");
	}
	@Test(groups = "client")
	public void test4() {
		System.out.println("这是客户端的测试组4444！");
	}
	@BeforeGroups("server")
	public void beforeGroups() {
		System.out.println("这是在服务端组运行前运行的方法！");
	}
	@AfterGroups("client")
	public void afterGroups() {
		System.out.println("这是在客户端运行之后运行的方法！");
	}
}
