package objects;

public class StaticObject { // for general purposes // concrete class
	
	public static final String CompanyName = "ABC";
	
	public static int computeData(int z, int y) {
		return z*y;
	}
	
	public static String displayData(String title, String name) {
		return title + " " + name;
	}
	
}
