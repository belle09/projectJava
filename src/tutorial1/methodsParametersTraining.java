package tutorial1;

class Robot {
	public void speak(String text) {
		System.out.println(text);
	} // end speak method
	
	public void jump(int height) {
		System.out.println("Jumping: " + height);
	} // end jump method

	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " meters in direction " + direction);
	} // end move method
	
} // end Robot class

public class methodsParametersTraining {

	public static void main(String[] args) {
		Robot robocap = new Robot();
		
		robocap.speak("Hi, I'm Angel");
		robocap.jump(7);
		
		robocap.move("West", 12.5);
		
		String greeting = "Hello there";
		robocap.speak(greeting);
		
		int value = 14;
		robocap.jump(value);
		
	} // end main program

} // end main class
