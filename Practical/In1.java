package corejava;

//Java program to demonstrate working of
//interface

import java.io.*;

     //A simple interface
interface In1 {
	
	 // public, static and final 
    final int a = 10;

     // public and abstract
    void display();
}

    // A class that implements the interface.
class TestClass implements In1 {
    
    // Implementing the capabilities of
    // interface.
    public void display(){
    System.out.println("Amruta");
    }

    // Main method
    public static void main(String[] args)
    {
    	//Creating object of test class
        TestClass t = new TestClass();
        
        //calling display method using object
        t.display();
        System.out.println(a);
    }
}

