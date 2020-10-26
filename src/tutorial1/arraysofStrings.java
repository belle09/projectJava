package tutorial1;

public class arraysofStrings {

	public static void main(String[] args) {
		// one
		String[] words = new String[3];		
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		// two
		String[] fruits = {"apple", "banana", "pear", "kiwi"};
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		} // end for

		
		// three
		int value = 0;
		
		String text = null;
		
		System.out.println(text);
		
		
		// four
		String[] texts = new String[2];
		//System.out.println(texts[0]);
		
		texts[0] = "one";
		
		System.out.println(texts[0]);
	} // end main

} // end class
