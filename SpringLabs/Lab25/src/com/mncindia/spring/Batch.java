package com.mncindia.spring;

public class Batch {
	String bid;
	String sd;
	String timing;
	int nos;
	public Batch(String bid, String sd, String timing, int nos) {
		
		this.bid = bid;
		this.sd = sd;
		this.timing = timing;
		this.nos = nos;
	}
	
	
	public String toString() {
		String msg="MNC Student....new Batch";
		msg=msg+"\n batch id:"+bid;
		msg=msg+"\n batch id:"+sd;
		msg=msg+"\n batch id:"+timing;
		msg=msg+"\n batch id:"+nos;
		
		
		
		return msg;
	}

}
