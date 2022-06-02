package corejava;

import java.io.*;

//java program to read content from file a into byte array

public class ByteInputArray {

	public static void main(String[] args) throws IOException {
		
	    InputStream input = new FileInputStream("D:\\Reader.txt");  
	    
	    //creating the object of DataInputStream class
	    DataInputStream i = new DataInputStream(input); 
	    
	    int count = input.available();  
	    byte[] ary = new byte[count];  
	    i.read(ary);  
	    for (byte bt : ary) {  
	    	
	    	//converting byte to character 
	      char k = (char) bt;  
	      
	      //printing the result
	      System.out.print(k+"-"); 
	      
	      //close method
	      i.close();
       }  
   }
}
