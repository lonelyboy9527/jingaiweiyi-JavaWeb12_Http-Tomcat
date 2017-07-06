package com.itheima.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
public class MyFirstServlet implements Servlet {
	
	/* 专门向客户提供相应的方法*/
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		HttpServletResponse response = (HttpServletResponse)arg1;
		
		/* 可从jdbc操作---从数据库获取动态数据*/
//		response.getWriter().write("this is my first servlet!!!");
		response.getWriter().write("<h1 style='color:red'>hello,html!</h1>");

		
	}
	
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}



}
