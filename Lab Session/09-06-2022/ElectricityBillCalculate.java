package corejava;

import java.io.*;
import java.util.Scanner;

//java program to calculate electricity bill

public class ElectricityBillCalculate {

	static double calculateElectricityBill(int units) {
		
		//Creating variables
		int u;
		double amt =0,uni;
		uni= units;
		
		//using if else conditions
		if(units<=0) {
			return units;
		}
		else {
			if(units>30) {
				u=units-30;
				amt=30.0*3.5;
				if(u>30 && u>=70) {
				u=u-70;
				amt=amt+(70*4);
			
				}
				amt=amt+(u*5);
			}
			else {
				amt=uni*3.5;
				}
		}
		return amt;
		}
	
	//main method
	public static void main(String[] args) {
		
		//creating variables
		int units;
		double amount ;
		System.out.println("Enter Your Units:");
		
		//scanner class object
		Scanner sc= new Scanner(System.in);
		
		//input
		units=sc.nextInt();
		amount = calculateElectricityBill(units);
		
		//printing output using if else
		if(amount<0) {
			System.out.println("INVALID INPUT");
		}
		else if (amount==0) {
			System.out.println(0.0);
		}
		else {
			System.out.println("Your electricity bill amount is :"+amount);
			}
	}
}