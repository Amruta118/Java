package corejava;

import java.io.*;

//java program to read input using BufferedReader

public class BufferedReaderExample {

	public static void main(String[] args)throws Exception {
         FileReader file=new FileReader("D:/Reader.txt");
		
		//create object of bufferedReader class to read from the created file
		BufferedReader b=new BufferedReader(file);
		
		//creating variable
		int i;
		while((i=b.read())!=-1){
			System.out.print((char)i);
		}
		
		//close BufferedReader class
		b.close();
		
		//close FileReader class
		file.close();
		

	}

}
