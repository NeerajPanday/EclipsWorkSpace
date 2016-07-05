package com.mncindia.spring;

public class Fee {
	double tatalFee;
	double feepaid;
	double feeBal;
	
	public Fee(double tatalFee,double feepaid,double feeBal)
	{
		super();
		this.tatalFee=tatalFee;
		this.feeBal=feeBal;
		this.feepaid=feepaid;
	}

	public double getTatalFee() {
		return tatalFee;
	}

	public void setTatalFee(double tatalFee) {
		this.tatalFee = tatalFee;
	}

	public double getFeepaid() {
		return feepaid;
	}

	public void setFeepaid(double feepaid) {
		this.feepaid = feepaid;
	}

	public double getFeeBal() {
		return feeBal;
	}

	public void setFeeBal(double feeBal) {
		this.feeBal = feeBal;
	}
	

}
