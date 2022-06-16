package corejava;

//Java program to display the toys with price

import java.util.Scanner;

public class ToyExample {
	
        //creating multi string array
		String[][] toys = new String [6][6];

		//constructor
	    ToyExample()
	    {

	    toys [0][0]="1";
	    toys[0][1]="Barbie";

	    toys [1][0]="2";
	    toys [1][1] ="Robot Dog";

	    toys [2][0]="3";
	    toys [2][1]="Magic 8 Ball";

	    toys [3][0]="4";
	    toys [3][1]="Juggling Clubs";

	    toys [4][0]="5";
	    toys[4][1]="Action figure";
	    
	    toys [5][0]="6";
	    toys [5][1]="Teddy bear";
	    

	    }

	    //static get toy method
	    public static String getToy(int price)
	    {
	        String nameString;
	        switch(price)
	        {
	            
	            //price of each toy in case value
	            case 300: 
	                nameString = "Barbie";
	                return nameString;
	            
	            case 450:
	                nameString = "Robot Dog";
	                return nameString;
	                
	            case 200:
	                nameString = "Magic 8 Ball";
	                return nameString;
	                
	            case 550:
	                nameString = "Juggling Clubs";
	                return nameString;
	                
	            case 850:
	                nameString = "Action figure";
	                return nameString;
	                
	            case 600:
	            	nameString = "Teddy Bear";
	            	return nameString;
	                
	            default:
	                nameString = "No Toys Available in this Range";
	                return nameString;
	        }
	        }

	 public static void main(String[] args) {
		 
		   //creating object of scanner class
		 int price;
		 System.out.println("Enter the price:");
	        Scanner sc = new Scanner (System.in); 
	         price = sc.nextInt ();
	        
         System.out.println(getToy(price));

	        sc.close();
	    }
	}
