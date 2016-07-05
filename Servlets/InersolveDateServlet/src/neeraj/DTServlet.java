package neeraj;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DTServlet extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
{
	Date d=new Date();
	PrintWriter out=res.getWriter();
	out.print(d);
}
}
