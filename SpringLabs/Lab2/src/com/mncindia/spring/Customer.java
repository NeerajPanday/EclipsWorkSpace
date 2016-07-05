package com.mncindia.spring;

import java.util.*;

public class Customer {
private int cid;
private String cname;
private String email;
private Long phone;
private List<String> emails;
private Set<Long> phones;
private Map<String,Long> refs;
private Properties myprops;
private Address address;
private List<Account> account;
public Customer(int cid, String cname, String email, Long phone) {
	this.cid = cid;
	this.cname = cname;
	this.email = email;
	this.phone = phone;
}
public void setEmails(List<String> emails) {
	this.emails = emails;
}
public void setPhones(Set<Long> phones) {
	this.phones = phones;
}
public void setRefs(Map<String, Long> refs) {
	this.refs = refs;
}
public void setMyprops(Properties myprops) {
	this.myprops = myprops;
}
public void setAddress(Address address) {
	this.address = address;
}
public void setAccount(List<Account> account) {
	this.account = account;
}

public void show()
{
	System.out.println(cid);
	System.out.println(cname);
	System.out.println(email);
	System.out.println(phone);
	System.out.println(emails);
	System.out.println(phones);
	System.out.println(refs);
	System.out.println(myprops);
	System.out.println(address);
	for(Account acc:account)
	{
		System.out.println(acc);
	}
	
	System.out.println(email.getClass().getName());
	System.out.println(phones.getClass().getName());
	System.out.println(refs.getClass().getName());
	System.out.println(myprops.getClass().getName());
	
}


}
