package corejava;

//Java program to print pattern

class PatternPrint {

	public static void main(String[] args) {
		
		//Defining i and j
		//i for rows and j for columns
		int i, j;
		
		//row denotes the number of rows you want to print  
		int row = 9;    
		
		//Outer loop work for rows  
		for (i=0; i<row; i+=2)   
		{  
			
		//inner loop work for space  
	    for (j=row-i; j>1; j--)   
		{  
			
		//prints space between two stars 
		System.out.print(" ");   
		}   
		
		//inner loop for columns 
		for (j=0; j<=i; j++ )   
		{   
			
		//prints star  
		System.out.print("* ");   
		}   
		
		//throws the cursor in a new line after printing each line 
		System.out.println(); 
		}
   }
}
