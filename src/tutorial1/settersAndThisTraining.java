package tutorial1;

class Frog{
	
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	} //  end setName method
	
	public void setAge(int age) {
		this.age = age;
	} // end setAge method
	
	public String getName() {
		return name;
	} // end getName method
	
	public int getAge() {
		return age;
	} // end getAge method
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	} // end setInfo method
	
} // end class

public class settersAndThisTraining {

	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		
		//frog1.name = "Vico";
		//frog1.age = 1;
		
		frog1.setName("Vico");
		frog1.setAge(1);
		
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
	} // end void

} // end class
