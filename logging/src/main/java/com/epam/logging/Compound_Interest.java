package com.epam.logging;

public class Compound_Interest {
	double P,T,R;
	public Compound_Interest(double P,double T,double R) {
		this.P=P;
		this.T=T;
		this.R=R;
	}
	public double calculateCI() {
		return Math.round(P*Math.pow(1+R/100.0,T));
	}
}

