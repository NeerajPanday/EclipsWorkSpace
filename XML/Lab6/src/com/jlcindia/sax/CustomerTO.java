package com.jlcindia.sax;

public class CustomerTO {
private String cid;
private String name;
private String email;
private String phone;
private String city;
private String status;
private String cname;
public String getCid() {
	return cid;
}
public void setCid(String cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String toString()
{
	return ""+cid+"\t"+cname+"\t"+phone+"\t"+city+"\t"+status+"\t"+email;
}
}
