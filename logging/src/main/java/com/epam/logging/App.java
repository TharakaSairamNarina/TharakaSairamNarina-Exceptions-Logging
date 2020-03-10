package com.epam.logging;

import java.util.Scanner;
import org.apache.logging.log4j.*;

public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);
	public static void main( String[] args ){
    	Scanner input=new Scanner(System.in);
        logger.debug("Enter Your Option:\n1.Calculate Interest\n2.Estimate House Construction Cost");
        int option=input.nextInt();
        if(option==1) {
        	System.out.print("Enter Principle Amount : ");
        	double P=input.nextDouble();
        	System.out.print("Enter Time Taken : ");
        	double T=input.nextDouble();
        	System.out.print("Enter Rate Of Interest : ");
        	double R=input.nextDouble();
        	logger.debug("Enter your type:\n1 Simple Interest\n2 Compound Interest");
        	int type=input.nextInt();
        	if(type==1) {
        		Simple_Interest si=new Simple_Interest(P,T,R);
        		logger.debug("Simple Interest is : "+ si.calculateSI()+" INR");
        	}
        	else if(type==2) {
        		Compound_Interest ci=new Compound_Interest(P,T,R);
        		logger.debug("Compound Interest is : "+ci.calculateCI()+" INR");
        	}
        }
        else {
        	logger.debug("Enter Area Of The House : ");
        	double area=input.nextDouble();
        	logger.debug("Enter Material Standards you need : ");
        	logger.debug("1.Standard Material\n2.Above Standard Material\n3.High Standard Material\n4.High Standard Material And Fully Automated House");
        	int op=input.nextInt();
        	House h=new House(area,op);
        	logger.debug("Total Cost : "+h.total() +" INR");
        }
        input.close();
    }
}
