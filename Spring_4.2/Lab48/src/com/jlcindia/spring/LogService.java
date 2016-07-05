package com.jlcindia.spring;

public class LogService {
public void logBefore(){
	System.out.println("Ls-LogBefore");
}
public void LogReturning()
{
	System.out.println("Ls-Logreturning");
}
public void LogThrowing(Exception e)
{
	System.out.println("Ls-logThrowing");
	System.out.println(e);
}
}
