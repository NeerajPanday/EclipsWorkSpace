package com.mncindia.spring;

import java.beans.PropertyEditorSupport;

public class StudentIDEditor extends PropertyEditorSupport{
	static
	{
		System.out.println("StudentIdEditotr");
	}
	public void setAxText(String txt)throws IllegalArgumentException
	{
		System.out.println("yes i m");
		String p1=txt.substring(0,3);
		System.out.println(p1);
		String p2=txt.substring(4);
		StudentId sid=new StudentId(Integer.parseInt(p2), p1);
		this.setValue(sid);
		
	}

}
