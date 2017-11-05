package com.neeraj;

public class FreeTicketPass {

	public static void main(String[] args) {
		int age=Integer.parseInt(args[0]);
		if (age>40){
			throw new OLDMenAge("Congrats! you are eligible for free Ticket");
		}else if(age<40){
			throw new YoungMenAge("Sorry! you are not eligible for free Ticket");
		}else{
			System.out.println("You are not eligible for travel alone");
		}
	}
}
class OLDMenAge extends RuntimeException{
	OLDMenAge(String a){
		super(a);
	}
}
class YoungMenAge extends RuntimeException{
	YoungMenAge(String s){
		super(s);
	}
}