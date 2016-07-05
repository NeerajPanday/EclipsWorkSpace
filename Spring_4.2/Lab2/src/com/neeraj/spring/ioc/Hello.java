package com.neeraj.spring.ioc;
public class Hello 
{
   private A aobj;
   private B bobj;
   public void setAobj(A aobj)
   {
	   System.out.println("A-obj");
	   
	   this.aobj=aobj;
   }
   public void setBobj(B bobj)
   {
	   System.out.println("B bobj");
	   this.bobj=bobj; 
   }
   public void show()
   {
	   System.out.println("show in hello");
	   aobj.show();
	   bobj.show();
   }
}
