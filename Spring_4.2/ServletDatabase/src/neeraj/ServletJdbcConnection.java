package neeraj;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ServletJdbcConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletJdbcConnection() {
        System.out.println("Default Constructor");
        
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method called");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sid=request.getParameter("stuid");
		String sname=request.getParameter("stuname");
		String semail=request.getParameter("stuemail");
		String sphone=request.getParameter("stuphone");
		//database connetivity code here....
		Connection con=null;
		PreparedStatement ps=null;
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/neeraj";
		con=DriverManager.getConnection(url,"root","neeraj");
		String sql="insert into student values(?,?,?,?)";
		ps=con.prepareStatement(sql);
		ps.setString(1, sid);
		ps.setString(2, sname);
		ps.setString(3, semail);
		ps.setString(4, sphone);
		int x=ps.executeUpdate();
		if(x==1){
			System.out.println("Record Inserted Successfully");
		}
		else{
			System.out.println("Record Not Inserted! plz Tyr Again...");
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
}
