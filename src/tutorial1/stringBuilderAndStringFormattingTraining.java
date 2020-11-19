package tutorial1;

public class stringBuilderAndStringFormattingTraining {

	public static void main(String[] args) {

		// inefficient
		String info = "";
		
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";
		
		System.out.println(info);
		
		// more efficient
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		System.out.println(sb.toString());
		
		// shortcut of StringBuilder
		StringBuilder s = new StringBuilder();
		
		s.append("My name is Roger")
		.append(" ")
		.append("I am a skydiver.");
		
		System.out.println(s.toString());
		
		
		// String Formatting
		System.out.println("Here is some text.\tThat was a tab.\nThat was a newline");
		
		// Formatting Integers
		System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);
		
		for(int i=0; i<4; i++) {
			System.out.printf("%-2d: %s\n", i, "here is some text");
		}
		
		// Formatting floating point values
		System.out.printf("\nTotal value: %-6.2f\n", 343.23423);
		
	} // end main

} // end class
