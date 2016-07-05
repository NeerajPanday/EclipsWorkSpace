package com.mncindia;

public class Age {
	private int days;
	private int month;
	private int years;
	private Age(){
		
	}
public Age(int dy,int mon,int yrs){
	this.days=dy;
	this.month=mon;
	this.years=yrs;
}
public int getDays() {
	return this.days;
}
public int getMonth() {
	return this.month;
}
public int getYears() {
	return this.years;
}
@Override
public String toString() {
	return "days"+days+"\t month"+month +"\t yrs"+years;
}
}
