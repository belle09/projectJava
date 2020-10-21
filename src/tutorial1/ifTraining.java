package tutorial1;

public class ifTraining {

	public static void main(String[] args) {

	    int year=2019;
	    String str = "geeks";
	    /*if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
	        System.out.println("LEAP YEAR");
	        System.out.println(year);
	    }  
	    else{  
	        System.out.println("COMMON YEAR");
	        System.out.println(year);
	    }  
		*/
	    
	    if((year < 2020 && year != 2019)) {
	    	System.out.println("First: " + year);
	    } else if (str == "geeks") {
	    	System.out.println(str);
	    } else {
	    	System.out.println("none: " + year);
	    }
		
	} // end main

} // end class
