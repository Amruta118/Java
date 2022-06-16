package corejava;

//Java program to play trivia game

import java.util.*;
import java.io.*;

public class TriviaGame {

	    //public static method for points
	    public static int[] points= {2,3,2,3,5};
	    
	    //public static method for answer
		public static String[] answers = {"OTTAWA","HOCKEY","DELHI","LOTUS","CHINA"};
		
		public static int triviaMethod(String[] questions, String[] stt) {
			
			//creating scanner class object
			Scanner sc=new Scanner(System.in);
			
			//creating variable
			String str;
			int point=0;
			
			for(int i=0;i<5;i++) {
				System.out.println(questions[i]);
				System.out.println(stt[i]);
				
				//condition for upper case latters
				if(stt[i].toUpperCase().equals(answers[i])) {
					System.out.println("Correct");
					point+=points[i];
					System.out.println("");
				}
				else {
					System.out.println("Wrong Answer");
					System.out.println("");
				}
			}
			return point;
			
		}
		public static void main(String[] args) throws Exception {
			
			//create variable
			int point;
			
			//questions
			System.out.println("What is the capital of CANADA?"); 
			
			System.out.println("What is the National Game of INDIA?");
			
			System.out.println("What is the capital of INDIA?");
			
			System.out.println("what is the National Flower of INDIA?");
			
			System.out.println("What is the largest population COUNTRY in the world?");
			System.out.println("Enter Answer");
			
			//creating object of scanner class
			Scanner sc=new Scanner(System.in);
			
			//creating object of String array
			String[] stt=new String[5];
			String[] questions = {
					"Question 1: What is the capital of CANADA?", 
					"Question 2: What is the National Game of INDIA?",
					"Question 3: What is the capital of INDIA?",
					"Question 4: what is the National Flower of INDIA?",
					"Question 5: What is the largest population COUNTRY in the world?",
			};
			
			for (int i=0;i<5;i++) {
				stt[i]=sc.nextLine();
				}
			point=triviaMethod(questions,stt);
			
			//print points
			System.out.println("Final score:" +point);
			}
}
