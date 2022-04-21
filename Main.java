package labNinePointOne;

public class Main {

	public static void main(String[] args) {
		
		Student milind = new Student("Milind", 69);
		GradStudent john = new GradStudent("John", "Business Managment", 420);
		
		milind.printWelcome();
		john.printWelcome();
		
	}

}
