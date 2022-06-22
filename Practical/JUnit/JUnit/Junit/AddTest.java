package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	public void Addtest() {
		//creating a object of class
		MyJunitClass junit = new MyJunitClass();
		int result= junit.add(5, 6);
		
		//check result used assert keyword
		
		assertEquals(10, result);
	}
	

}
