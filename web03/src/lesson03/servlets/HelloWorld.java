package lesson03.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloWorld implements Servlet {
	ServletConfig config;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() ȣ���");
		this.config = config;
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() ȣ���");
	}
	
	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		System.out.println("service() ȣ���");
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig() ȣ���");
		return this.config;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo() ȣ���");
		return "version=1.0;author=eomjinyoung;copyright=eomjinyoung 2013";
	}
}
