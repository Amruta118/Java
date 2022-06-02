package corejava;

import java.io.*;

//java program of BufferedWriter to write data to a file

public class BufferedWriterExample {

	public static void main(String[] args)throws IOException {
		FileWriter file = new FileWriter("D:\\Reader.txt");
		
		//create a object of BufferedWriter class
      	BufferedWriter buffer = new BufferedWriter(file);
      	
      	//message to write in file
      	 buffer.write("Welcome to Mumbai");  
			
      	 //close method
		    buffer.close();  
			
		    System.out.println("Success");

	}

}
