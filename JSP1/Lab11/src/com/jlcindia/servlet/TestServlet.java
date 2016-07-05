package com.jlcindia.servlet;
import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet{
public void service(HttpServletRequest request,
		HttpServletResponse response) throws ServletException,IOException

{
	String fnm=request.getParameter("fname");
	Date dt=new Date();
	if(fnm==null||fnm.trim().length()==0)
	{
		fnm="Guest";
	}
	String msg="<h1>HI"+fnm+"<br/>You have sent Request on"+dt;
	response.setContentType("text/html");
	response.getWriter().write(msg);
	
}
}