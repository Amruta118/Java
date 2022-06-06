package readerandwriterhierarchy;

//Java program showcasing uses of call by value in this  example

//importing java input output classes 
import java.io.*;

//class
public class CallByValueExample {

	//method to swap the numbers
	static void swap(int a, int b)
	{
		
		//creating a temporary variable in stack memory
	    //and uploading value in it
		
		//step1
		int temp = a; 
		//step 2
		a=b;         
		//step 3
		b=temp;      
		
		// Display message after swapping numbers
		System.out.println("Values after swapping x ="+a+" y ="+b);
	}
	
	public static void main(String[] args) {
		
		//custom input/numbers to be swapped
		int x=5;
		int y=7;
		
		//display message before swapping numbers
		System.out.println("before swapping x =" + x+" and y ="+ y);
		
		//using above created method to swap numbers
	    swap(x,y);
	   }
}
