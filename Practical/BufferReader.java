package corejava;
//java program to read and data from particular file
import java.io.*;

public class BufferReader {

	public static void main(String[] args)throws Exception{
		FileReader file=new FileReader("D:/myFile.txt");
		
		//create object of bufferedReader class to read from the created file
		BufferedReader b=new BufferedReader(file);
		int i;
		while((i=b.read())!=-1){
			System.out.print((char)i);
		}
		b.close();
		file.close();
		}
}
