package objects;

import Interface.Cook;
import Interface.Filipino;
import Interface.Sports;

public class Student extends Cook implements Interface.Student, Filipino, Sports {

	@Override
	public void study(String title, int repetition) {
		System.out.println("Student is studying " + title + " with repetition of " + repetition);
	} // end method study()

	@Override
	public void getGrades() {
		
	} // end method getGrades()

	@Override
	public void speakTagalog() {
		
	} // end method speakTagalog()

	@Override
	public void Chess() {
		
	} // end method Chess()

	@Override
	public void cuisine() {

		super.cuisine();
	} // end method cuisine()

	@Override
	public void dishes() {
		// TODO Auto-generated method stub
		
	} // end method dishes()
	
	
	
} // end class Student
