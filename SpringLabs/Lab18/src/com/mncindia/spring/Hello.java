package com.mncindia.spring;
import org.springframework.beans.factory.annotation.Required;

public class Hello {
	private A aobj;
	private B bobj;
	
	@Required
	public void setAobj(A aobj) {
		System.out.println("Hello-setAobj()");
		this.aobj = aobj;
	}

	@Required
	public void setBobj(B bobj) {
		System.out.println("setBobj()");
		this.bobj = bobj;
	}


	public void show()
	{
		System.out.println(" Hello show()");
		aobj.showA();
		bobj.showB();
	}

}
