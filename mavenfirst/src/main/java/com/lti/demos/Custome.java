package com.lti.demos;

public class Custome {
	private int custNo;
	private String custName;
	private double billamount;
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getBillamount() {
		return billamount;
	}
	public void setBillamount(double billamount) {
		this.billamount = billamount;
	}
	@Override
	public String toString() {
		return "Custome [custNo=" + custNo + ", custName=" + custName + ", billamount=" + billamount + "]";
	}
	public Custome(int custNo, String custName, double billamount) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.billamount = billamount;
	}

}
