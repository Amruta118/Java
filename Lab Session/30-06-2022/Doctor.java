package corejava;
//java program to print doctor
import java.util.Scanner;

//create class doctor
//private variable declared
public class Doctor
{
private int doctorId;
private String doctorName, location;

//passing parameter
Doctor(int i,String n,String l)
{
doctorId = i;
doctorName = n;
location = l;
}

//set method for Id
public void setDoctorId(int i) 
{
doctorId = i;
}

//set method for doctor name
public void setDoctorName(String doctorName) 
{
this.doctorName = doctorName;
}
	    
// set method for location
public void setLocation(String location) 
{
this.location = location;
}

//get method
public void getDetails()
{
System.out.println("Doctor ID: "+doctorId);
System.out.println("Doctor Name: "+doctorName);
System.out.println("Location: "+location);
}
}

//create class speacialistDoctor 
class SpecialistDoctor extends Doctor
{
private String specialist;

//set method for specialist
public void setSpecialist(String s) 
{
this.specialist = s;
}

// get method for specialist
public String getSpecialist()
{
return specialist;
}

//passing parameter
SpecialistDoctor(int i,String n,String l,String s)
{
super(i, n, l);
specialist = s;
}

public void getDetails()
{
super.getDetails();
System.out.println("Specialist: "+specialist);
}
}

   
   