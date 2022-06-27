package corejava;

//Java program to Add a step method in the welcome thread of question 1 to delay its execution for 200ms

//creation of thread7 class to extend thread class
class Thread7 extends Thread
{
	
//initiate run method for thread
public void run()
{
	
//create a try catch block 
try
{
Thread.sleep(900);
}
catch (InterruptedException e)
{
e.printStackTrace();
}
System.out.println("Welcome");
}
}

//creation of thread8 class to extend thread class
class Thread8 extends Thread 
{

//initiate run method for thread
public void run() 
{
System.out.println("Good morning");
}
}


class MyThread2 
{
public static void main(String[] args) 
{
	
//create object of thread class
Thread7 t7= new Thread7();
Thread8 t8= new Thread8();

//start thread
t7.start();
t8.start();
}
}


