package corejava;

// Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.

//creation of thread1 class to extend thread class
class Thread1 extends Thread
{
	
//initiate run method for thread
	
public void run()
{
while (true)
{
System.out.println("Welcome");
}
}
}

//creation of thread2 class to extend thread class
class Thread2 extends Thread
{
public void run() 
{
while (true) 
{
System.out.println("Good morning");
}
}
}

class MyThread 
{
 public static void main(String[] args)
{
	 
//create object of thread class
Thread1 t1= new Thread1();
Thread2 t2= new Thread2();
        
//start thread
 t1.start();
t2.start();
}
}

