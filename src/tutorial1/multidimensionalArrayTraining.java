package tutorial1;

public class multidimensionalArrayTraining {

	public static void main(String[] args) {

		// one-dimensional array
		int[] values = {3,5,2343};
		
		System.out.println(values[2]);
		
		// multidimensional array
		int[][] grid = {
			{3,5,2343},
			{2,4},
			{1,2,3,4}
		}; // end grid
			
		System.out.println(grid[1][1]);	
		System.out.println(grid[0][2]);
		
		// two-dimensional array of Strings
		String[][] text = new String[2][3];
				
		text[0][1] = "Hello there";
		
		System.out.println(text[0][1]);

		// nested for-loop
		for(int row=0; row<grid.length; row++) {
			for(int col=0; col<grid[row].length; col++) {
				
				System.out.print(grid[row][col] + "\t");
				
			} // end inner for
			System.out.println();
			
		} // end out for
		
		
		// Empty index
		String[][] words = new String[2][];
		
		System.out.println(words[0]);
		words[0] = new String[3];
		
		words[0][1] = "Hi again";
		
		System.out.println(words[0][1]);
	} // end main
} // end array class
