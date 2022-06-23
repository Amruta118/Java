package corejava;

public class SnakeCase {
	public String camelToSnake(String str) {
		//Declaring string 
		String stt="";
		
		//converting string to lower case
		stt+=Character.toLowerCase(str.charAt(0));
		
		//using for loop for iterating string
		for (int i=1;i<str.length(); i++) {
			char ch=str.charAt(i);
			if(Character.isUnicodeIdentifierPart(ch)) {
				
				//adding _ to the string
				stt=stt+'_';
				stt=stt+Character.toLowerCase(ch);
				
			}
			else {
				stt=stt+ch;
			}
		}
		return stt;
	}
	
public static void main(String args[]) throws Exception{
		
		String a = "Amruta Dhumal";
		//creating object of snake case
		SnakeCase sn=new SnakeCase();
		
		System.out.println("Before Converting SnakeCase:"+a);
		System.out.println("After Converting SnakeCase:" +sn.camelToSnake(a));
	}
	

}
