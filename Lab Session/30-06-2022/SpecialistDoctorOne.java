package corejava;
import java.util.Scanner;

class SpecialistDoctorOne
{
public static void main(String[] args) 
{
//create object of scanner class
Scanner sc = new Scanner(System.in);
String t = sc.nextLine();

if(t.equalsIgnoreCase("Specialist"))
{
	
//create object of SpecialistDoctor class
SpecialistDoctor s = new SpecialistDoctor(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), sc.nextLine());
s.getDetails();
}
else if(t.equalsIgnoreCase("Doctor"))
{
Doctor s = new Doctor(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
s.getDetails();
}
else
{
System.out.println("Invalid Input");
}     
sc.close();  
}
}