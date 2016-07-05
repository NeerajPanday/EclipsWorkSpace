package com.mncindia.spring;


import java.beans.PropertyEditorSupport;
import java.util.Arrays;
import java.util.List;

public class ListEditor extends PropertyEditorSupport{
	
	public void setAsText(String txt) throws IllegalArgumentException {
		String str[]=txt.split(",");
		List list=Arrays.asList(str);
		this.setValue(txt);
	}

}
