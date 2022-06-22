package Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;



public class ConCatTest {
	

		@Test
		public void ConCattest() {
			//creating a object of class
			MyJunitClass junit = new MyJunitClass();
			String result= junit.ConCat("My", "Course");
			
			//check result used assert keyword
			
			assertEquals("MyCourse", result);
		}
}
