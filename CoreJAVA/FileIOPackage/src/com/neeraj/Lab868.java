package com.neeraj;

import java.io.IOException;

public class Lab868 {

	public static void main(String[] args) throws Exception 
	{
	JlcReader rd=new JlcReader();
	System.out.println("Enter the sid");
	String sid=rd.readLine();
	System.out.println("Enter Name");
	String sname=rd.readLine();
	System.out.println("Enter fee");
	String phone=rd.readLine();
	System.out.println(sid+" "+sname+" "+phone);

	}

}
class JlcReader{
	public String readLine() throws IOException{
		StringBuffer val=new StringBuffer();
		while(true){
			int asc=System.in.read();
			if(asc==13);
			else if(asc==10)
				break;
			else{
				char ch=(char)asc;
	             val.append(ch);
			}
		}
		return val.toString();
	}
}
