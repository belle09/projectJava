package tutorial1;

public class multidimensionalArraySample {

	public static void main(String[] args) {

		int[][] stocks = {
				{1,3,5,7,9},
				{2,4,6,8,10,12},
				{3,6,9,12,15,18,21},
				{4,8,12}
		};
		
		/*for(int row = 0; row<stocks.length; row++) {
			
			for(int col=0; col<stocks[row].length; col++) {
				
				System.out.print(stocks[row][col] + "\t");
			} // inner for
			System.out.println(); 
		} // outer for*/
	

		for(int[] woods: stocks) {
			
			for(int bricks: woods) {
				
				System.out.print(bricks + "\t");
				
			} // inner for
			System.out.println();
		
		} // outer for
		
		/*for(int[] exchange: stocks) {
			
			for(int pse: exchange) {
				System.out.print(pse + "\t");
			} // inner for
			System.out.println();
			
		} // outer for */
		
		
	} // end main

} // end class
