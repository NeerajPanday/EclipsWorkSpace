package com.neeraj;

public class CustomException {

	public static void main(String[] args) {
		try{
	
		 NeerajBankingSolution nbs=new   NeerajBankingSolution();
		 String s="null";
		 s=nbs.getNameByAccountNo("jhgfg");
		 System.out.println(s);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	 

}
class InvalidAccountNumber extends RuntimeException
{
	InvalidAccountNumber(String accno)
	{
		super(accno);
	}
}
class NeerajBankingSolution
{
	String getNameByAccountNo(String accno )
	{
		if(accno==null&&accno.isEmpty()&&accno.equals("20010212244"))
			throw new InvalidAccountNumber(accno);
		else 
			return "welcome To My BANK";
	}
}