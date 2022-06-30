package corejava;
//java program to calculate Transport Allowance of manager

//created class employee
class Employee
{
//create instance variables with data type
private long employeeId,employeephone;
private String employeeName,employeeAddress;
private double basicSalary,specialAllowance,Hra;

//default constructor
Employee()
{
employeeId=0;
employeephone=0;
employeeName="";
employeeAddress="";
basicSalary=0.0;
specialAllowance=250.00;
Hra = 1000.50;
}

//constructor overloaded
Employee(long id, String n,String a,long p,double s)
{
employeeId=id;
employeephone=p;
employeeName=n;
employeeAddress=a;
basicSalary=s;
specialAllowance=250.00;
Hra = 1000.50;	
}

//get basic salary
public double getbasicSalary()
{
return basicSalary;
}

//create method calculateSalary to calculate basic salary
public double calculateSalary()
{
	double salary = basicSalary+(basicSalary*specialAllowance*0.01)+(basicSalary* Hra/100);
	return salary;
}

//create method calculateTranportAllowance to calculate transport allowance by calculating 10% of the salary
public double calculateTranportAllowance()
{
	return 0.01*basicSalary;
}
}

//create class manager to extend employee
class Manager extends Employee
{

//create constructor overloading taking parameter and initialized with respected variable
Manager(long id,String n,String a,long p,double s)
{
super(id,n,a,p,s);
}
	
//For manager
//override calculateTranportAllowance method in manager class to calculate transport allowance as 15% of base salary
public double calculateTransportAllowance(Manager m,int a)
{
return 0.15*getbasicSalary();
}
}

//create class EmployeeData with main method
class EmployeeData
{
public static void main(String[] args)
{

//create object of Manager class
Manager m = new Manager(126534, "Peter", "Chennai India", 237844, 65000.0);

//call calculateSalary method
double salary =m.calculateSalary();

//print salary
System.out.println("Manager's Salary : "+salary);

//print TransportAllowance
System.out.println("Manager's Transport Allowance (15%) :"+m.calculateTransportAllowance(m, 15));
}
}
