package tutorial1;

public class SampleApplication {

	public static void main(String[] args) {
		int myNumber;
		int mySecondNumber;
		
		myNumber = 88;
		mySecondNumber = 99;
		
		String sampleText = "Hello ";
		String secondText = "How are you? ";
		String thirdText = "I'm Good ";
		String greetingText = sampleText + secondText + thirdText;
			
		System.out.println("The total is: " + myNumber + mySecondNumber);
		System.out.println(sampleText + ", " + secondText + " " + thirdText + ".");
		System.out.println(greetingText);
		
		
		myNumber = 88;
		mySecondNumber = 99;
		System.out.println("The total is: " + myNumber + mySecondNumber);
		System.out.println(sampleText + ", " + secondText + " " + thirdText + ".");
		System.out.println(greetingText);
	}
	
}
