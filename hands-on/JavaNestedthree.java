package corejava;
import java.util.ArrayList;
import java.util.List;
public class JavaNestedthree {

	public static void main(String[] args) {
		JavaNestedtwo n = new JavaNestedtwo();
		List<JavaNested> subjects = new ArrayList<JavaNested>();
		JavaNested subject1 = new JavaNested();
		subject1.setCode(210);
		subject1.setName("English");
		subjects.add(subject1);
		
		JavaNested subject2 = new JavaNested();
		subject2.setCode(220);
		subject2.setName("Science");
		subjects.add(subject2);
		
		JavaNested subject3 = new JavaNested();
		subject3.setCode(230);
		subject3.setName("Computer");
		subjects.add(subject3);
		
		// setting bean values
		n.setId(101);
		n.setName("Karthik");
		n.setSubjects(subjects);
		
		// getting bean value
		System.out.println("Student Id : " + n.getId());
		System.out.println("Student name : " + n.getName());
		
		List<JavaNested> subjectList = n.getSubjects();
		for (int i = 0; i < subjectList.size(); i++) {
		JavaNested subject = subjectList.get(i);
		System.out.println("Student subject " + (i + 1) + " : " + subject.getCode()
		+ " : " + subject.getName());
		}

	}

}
