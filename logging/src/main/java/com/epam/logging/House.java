package com.epam.logging;

public class House {
	double area;
	int option;
	public House(double area,int option) {
		this.area=area;
		this.option=option;
	}
	int[] cost= {1200,1500,1800,2500};
	public double total() {
		return area*cost[option-1];
	}
}

