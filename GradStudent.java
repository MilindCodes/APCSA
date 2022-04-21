package labNinePointOne;

public class GradStudent extends Student {
	private String dissertationTopic = "";
	/*
	 * Preconditions: takes in a string variable for the name, one for the dissertation topic, and an integer value for the id of the student
	 * Postconditions: the private variables are set the values that were passed through as arguments
	 */
	public GradStudent(String name, String dissertationTopic, int id) {
		this.id = id;
		setName(name);
		this.dissertationTopic = dissertationTopic;
	}
	
	public String getTopic() {
		return dissertationTopic;
	}
	
	public void setTopic(String topic) {
		dissertationTopic = topic;
	}
	
	public void printWelcome() {
		System.out.println("Welcome " + getName() + " to our insentive, hard, IMPOSSIBLE PHD PROGRAMMMMM!");
	}
	
	
	
}
