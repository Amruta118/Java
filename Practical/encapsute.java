package corejava;

public class encapsute {

	public static void main(String[] args) {
		
		//creating object of encapsulation class 
		encapsulation e=new encapsulation();
		
		//setting value of variable
		
		e.setName("Amruta");
		e.setRollno(12);
		e.setAge(20);
		
		//displaying values of variable
		
		System.out.println("Name:" +e.getName());
		System.out.println("Roll No:" +e.getRollno());
		System.out.println("Age:" +e.getAge());
		}

}
