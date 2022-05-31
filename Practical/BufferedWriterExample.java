package corejava;
//java program to write a particular file
import java.io.*;

public class BufferedWriterExample {

	public static void main(String[] args) throws Exception {
		//creating object of BufferedWriterExample class 
		FileWriter writer = new FileWriter("D:\\myFile.txt");  
		
		//create object of bufferedWriter class to write in the created file
	    BufferedWriter buffer = new BufferedWriter(writer);  
		
	    //message to the file
	    buffer.write("Welcome to Mumbai");  
		
	    buffer.close();  
		
	    System.out.println("Success");  

	}

}
