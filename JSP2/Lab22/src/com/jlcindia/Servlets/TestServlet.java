package com.jlcindia.Servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
protected void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
	String snm=request.getParameter("sname");
	if(snm==null || snm.trim().length()==0)
	{
		snm="Hey U r New User";
	}
	Date dt=new Date();
	request.setAttribute("Nm", snm);
	request.setAttribute("DT", dt);
	request.getRequestDispatcher("show.jsp").forward(request,response);
}
}
