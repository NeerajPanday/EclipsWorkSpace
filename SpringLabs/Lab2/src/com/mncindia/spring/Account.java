package com.mncindia.spring;

public class Account {
	private int accno;
	private String atype;
	private double bal;
	private Account()
	{
		System.out.println("Account-DC");
	}
	
	public void setAccno(int accno) {
		this.accno = accno;
	}
	
	public void setAtype(String atype) {
		this.atype = atype;
	}
	
	public void setBal(double bal) {
		this.bal = bal;
	}
	
	public String toString(){
		return ""+accno+"\t"+atype+"\t"+bal;
	}

}
