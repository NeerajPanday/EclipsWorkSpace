package com.neeraj;

public class Lab737 {

	public static void main(String[] args)
	{
		System.out.println("Main-Started");
		String sn="";
		try{
			StudentService sv=new StudentService();
			sn=sv.getNameBySid("Neeraj");
			System.out.println("Your name is"+sn);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
       System.out.println("main End here");
	}

}
class StudentService{
	String getNameBySid(String sname)
	{
		if(sname==null)
			throw new NullPointerException();
		else if(sname.equals("Neeraj"))
			return "pandey";
		else 
			throw new StudentNotFoundException(sname);
	}
}
class StudentNotFoundException extends RuntimeException
{
	String sname;
	StudentNotFoundException(String sname){
		
	super(sname);
	}
} 
