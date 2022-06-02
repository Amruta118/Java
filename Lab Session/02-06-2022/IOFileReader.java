package corejava;

//java program to show the usage of IOFileReader class

import java.io.*;

public class IOFileReader {

	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("D:\\Reader.txt");
			
			//create a object of BufferedWriter class
	      	BufferedWriter buffer = new BufferedWriter(file);
	      	
	      	//message to write in file
	      	 buffer.write("Welcome To Lecture");  
				
	      	 //close method
			    buffer.close();  
				
			    System.out.println("Success");
			    FileInputStream fin=new FileInputStream("D:\\Reader.txt");    
				 
				//Creating int data type variable
				int i=0; 
					
				//while loop for giving condition
			    while((i=fin.read())!=-1){    
				System.out.print((char)i);    
				  }    
				  
				  fin.close();    
			    }
		
		catch
		(Exception e)
		{
			System.out.println(e);
			}        
	}

}
