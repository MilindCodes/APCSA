public class Student {

	private String name = "";
	public int id = 0;
	/*
	 * Preconditions: a string value and int value as passed through as arguments
	 * Postconditions: the name and id variables are updated to be the values that were passed through as arguments
	 */
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public Student() {
		name = "John";
		id = (int) (Math.random() * 5000000);
	}
	/*
	 * Preconditions: nothing is passed through as an argument
	 * Postconditions: the value that is stored in the private variable name is returned
	 */
	public String getName() {
		return name;
	}
	/*
	 * Preconditions: a value of type string is passed as an argument
	 * Postcondition: the private name variable is updated to now be the variable that was passed through as an argument
	 */
	public void setName(String name) {
		this.name = name;
	}
	/*
	 * Preconditions: nothing is passed as an argument
	 * Postcondition: a welcoming message is printed followed by the name saved in the private variable name
	 */
	public void printWelcome() {
		System.out.println("Very warm welcome to " + name);
	}
	
}



