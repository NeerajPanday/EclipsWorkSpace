package com.jlcindia.servlets;

import java.io.IOException;
import java.io.Writer;
import java.sql.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class LoginServlet extends HttpServlet
{
	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		//collect data
		String un=req.getParameter("username");

		String pw=req.getParameter("pasword");
		String msg="";
		String tinku=null;
		//un="neeraj";
		//pw="pandey";
		if(un.equals(pw))
		{
			msg="<h1>Loging Success<br/>Welcome";
			try{
		java.sql.Connection con=null;
			java.sql.Statement st=null;
			java.sql.ResultSet rs=null;
			
				Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/neeraj","root","neeraj");
				String str="select * from student";
				st= con.createStatement();
				rs=st.executeQuery(str);
				if(rs.next())
						{
					String id=rs.getString(1);
					String nm=rs.getString(2);
					String em=rs.getString(3);
					String ph=rs.getString(4);
					Writer out=res.getWriter();
					out.write(id);
					out.write(nm);
					out.write(em);
					out.write(ph);
				     }
			}catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		else
		
			msg="<h1>Login Failed<br/>pls enter correct data";
	
		Writer out=res.getWriter();
		out.write(msg);
		
	}
}
