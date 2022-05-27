package corejava;
import java.util.ArrayList;
import java.util.List;
public class JavaCollectiontwo {

	public static void main(String[] args) {
		JavaCollection java = new JavaCollection();
		List<String> subjects = new ArrayList<String>();
		subjects.add("English");
		subjects.add("Science");
		subjects.add("Computer");
		
		java.setId(101);
		java.setName("Amruta");
		java.setSubjects(subjects);
		
		System.out.println("Student Id :"+java.getId());
		System.out.println("Student Name :"+java.getName());
		List<String> subjectList = java.getSubjects();
		for (int i = 0; i < subjectList.size(); i++) {
		System.out.println("Student subject " + (i + 1) + " : " + subjectList.get(i));
		}

	}

}
