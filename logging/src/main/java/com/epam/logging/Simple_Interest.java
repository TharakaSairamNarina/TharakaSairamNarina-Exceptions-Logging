package com.epam.logging;

public class Simple_Interest {
	double P,T,R;
	public Simple_Interest(double P,double T,double R){
		this.P=P;
		this.T=T;
		this.R=R;
	}
	public double calculateSI() {
		return Math.round((P*T*R)/100.0);
	}
}
