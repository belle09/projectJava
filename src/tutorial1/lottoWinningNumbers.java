package tutorial1;

public class lottoWinningNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		for (int one = 0; one < 8; one++) {
			
			int random = (int) (Math.random() * 64) + 1;
			System.out.println("first value is: " + random);


		} // first for
	}

}
