package corejava;

import java.io.Serializable;

class Estudent implements Serializable {
private int rollno;
private String name;

    public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	Estudent() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Estudent e=new Estudent();
		e.setRollno(10);
		e.setName("Amruta");
		System.out.println("roll no:" +e.getRollno());
		System.out.println("name:" +e.getName());
		}

}
