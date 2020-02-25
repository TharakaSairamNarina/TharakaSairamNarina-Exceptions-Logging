package com.epam.logging;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AppTest 
{
	private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args ){
    	Scanner input=new Scanner(System.in);
        logger.info("Enter Your Option:\n1.Calculate Interest\n2.Estimate House Construction Cost");
        int option=input.nextInt();
        if(option==1) {
        	logger.info("Enter Principle Amount : ");
        	double P=input.nextDouble();
        	logger.info("Enter Time Taken : ");
        	double T=input.nextDouble();
        	logger.info("Enter Rate Of Interest : ");
        	double R=input.nextDouble();
        	logger.info("Enter your type:\n1 Simple Interest\n2 Compound Interest");
        	int type=input.nextInt();
        	if(type==1) {
        		Simple_Interest si=new Simple_Interest(P,T,R);
        		logger.info("Simple Interest is : "+ si.calculateSI()+" INR");
        	}
        	else if(type==2) {
        		Compound_Interest ci=new Compound_Interest(P,T,R);
        		logger.info("Compound Interest is : "+ci.calculateCI()+" INR");
        	}
        }
        else {
        	logger.info("Enter Area Of The House : ");
        	double area=input.nextDouble();
        	logger.info("Enter Material Standards you need : ");
        	logger.info("1.Standard Material\n2.Above Standard Material\n3.High Standard Material\n4.High Standard Material And Fully Automated House");
        	int op=input.nextInt();
        	House h=new House(area,op);
        	logger.info("Total Cost : "+h.total() +" INR");
        }
        input.close();
    }
}
