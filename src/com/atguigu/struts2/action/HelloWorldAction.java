package com.atguigu.struts2.action;

//代替Servlet处理客户端请求
public class HelloWorldAction {
	
	/**
	 * 必须是public
	 * 必须是返回类型String
	 * 必须是无参数的
	 * 方法名称：默认是execute
	 * 异常声明可以省略
	 * @return
	 * @throws Exception
	 */
	public String hello() throws Exception{		
		System.out.println("Hello,Struts2!11114444555666");
		System.out.println("22222");
		System.out.println("33333");
		System.out.println("44444");
		return "success";
	}
	
}
