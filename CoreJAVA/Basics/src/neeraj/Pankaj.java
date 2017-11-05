package neeraj;

import java.util.Comparator;

public class Pankaj implements Comparator{
private int eid;
private String ename;
public Pankaj(int i, String string) {
	//System.out.println("Hello");
	}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
@Override
public int compare(Object arg0, Object arg1) {
	String s1=(String)arg0;
	String s2=arg1.toString();
	return s1.compareTo(s2);
}
}
