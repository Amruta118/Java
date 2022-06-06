package readerandwriterhierarchy;

//java program to demonstrate on call by reference by swapping two number

public class CallByReferenceEx {
	
   //method to swap the numbers by reference
   static void swapByReference(int num1, int num2) {
		
	    //creating a temporary variable in stack memory
        //and uploading value in it
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		// Display message after swapping numbers
		System.out.println("\n Values after swapping: X = " + num1 + " Y = " +num2);
       }

	public static void main(String[] args) {
		
		//custom input/numbers to be swapped
		int num1 = 5;
		int num2 = 8;
		
		//display message before swapping numbers
		System.out.println("The values before swapping: X = " + num1 + " and Y = " + num2);
		
		//using above created method to swap numbers
		swapByReference(num1, num2);
	}
}
