package objects;

// Parent
public class MachineForInheritance {
	protected String name = "I am a machine";
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	} // end setUsername set method - obtain value

	public String getPassword() {
		return password;
	} // end getPassword get method - display value

	public void setPassword(String password) {
		this.password = password;
	}

	public void start() {
		System.out.println("Machine started.");
	} // end start method

	public void stop() {
		System.out.println("Machine stopped.");
	} // end stop method

} // end class MachineForInheritance
