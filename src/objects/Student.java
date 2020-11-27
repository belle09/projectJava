package objects;

import Interface.Filipino;
import Interface.Science;
import Interface.Sports;

public class Student extends Human implements Interface.Study, Filipino, Sports, Science {

	@Override
	public void study(String title, int repetition) {
		System.out.println("Student is studying " + title + " with repetition of " + repetition);
	} // end method study()

	@Override
	public void setGrades(int grades) {
		System.out.println("The student's grade is " + grades);
	} // end method getGrades()

	@Override
	public void speakTagalog() {
		System.out.println("Student is speaking Tagalog");
	} // end method speakTagalog()

	@Override
	public void Chess() {
		System.out.println("Student is playing chess ");
	} // end method Chess()

	@Override
	public void experiment() {
		System.out.println("Student is experimenting Copper");
	}	// end method experiment() 

	@Override
	public void getGrades(int grades) {
		// TODO Auto-generated method stub
		
	}

} // end class Student
