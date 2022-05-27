package corejava;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		//setting bean values
		student.setId(101);
		student.setName("Amruta");
		student.setActive(true);
		//getting bean value
		System.out.println("Student Id : "+student.getId());
		System.out.println("Student name : "+student.getName());
		System.out.println("Student active : "+student.isActive());

	}

}
