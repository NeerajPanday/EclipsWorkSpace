package com.jlcindia.sax;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.*;
public class JLCHandler extends DefaultHandler
{
   public void startDocument(){
	   System.out.println("document is started");
   }
   public void startElement(String ns,String tn,String tln,Attributes atts)
   {
	System.out.println(tn+"Element is started");
	if(atts.getLength()>=1)
	{
		System.out.println(atts.getLocalName(0)+""+atts.getValue(0));
		System.out.println(atts.getLocalName(1)+""+atts.getValue(1));
	}
	System.out.println("ns");
   }
   public void characters(char ch[],int start,int total)
   {
	   String str=new String(ch,start,total);
			   System.out.println("character data is found"+str);
   }
   public void endElement(String ns,String tn,String tln){
	   System.out.println(tn+"element is ended");
   }
   public void endDocument(){
	   System.out.println("Document is ended");
   }
}
