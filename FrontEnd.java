import za.ac.tut.course.Course;
import za.ac.tut.subject.Subject;
import za.ac.tut.student.Student;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class FrontEnd
{
	public static void main(String[] args)
	{
		//Create an object of type course
		Course objCourse = new Course();
		//Create a list of subjects
		ArrayList<Subject> listOfSubject = new ArrayList<Subject>();
		
		String strCourseCode, strDescription;
		//Prompt for values
		
		strCourseCode = JOptionPane.showInputDialog(null,"Please enter course code");
		strDescription = JOptionPane.showInputDialog(null, "Please enter course desciption");
	    //Store the values to course object
		objCourse.setCourseCode(strCourseCode);
		objCourse.setDescription(strDescription);
		
		//Store subject to the arraylist of subjects
		int optionContinue = JOptionPane.showConfirmDialog(null, "Do you want to enter next subject", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		while (optionContinue ==JOptionPane.YES_OPTION )
		{
			//Prompt subject code, three tests
			String strInput;
			//Subject to store values
			Subject objSubject = new Subject();
			//Prompt and store values
			strInput = JOptionPane.showInputDialog(null, "Enter subject code");
			objSubject.setSubjectCode(strInput);
			strInput = JOptionPane.showInputDialog(null, "Enter Test 1");
			objSubject.setTest1(Integer.parseInt(strInput));
			strInput = JOptionPane.showInputDialog(null, "Enter Test 2");
			objSubject.setTest2(Integer.parseInt(strInput));
			strInput = JOptionPane.showInputDialog(null, "Enter Test 3");
			objSubject.setTest3(Integer.parseInt(strInput));		
		    listOfSubject.add(objSubject);
			optionContinue = JOptionPane.showConfirmDialog(null, "Do you want to enter next subject", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}
		
		//Store the values to the Student object class
		Student objStudent = new Student();
		objStudent.setStudentNo(213214);
		objStudent.setIntials("JK");
		objStudent.setSurname("Nkuna");
		objStudent.setCourse(objCourse);
		objStudent.setListOfSubjects(listOfSubject);
	    
		//Display the results
		String display = "";
		for(Subject subject :objStudent.getListOfSubjects())
		{
			display = display + "\n"+subject.getSubjectCode() + " Results is "+subject.determine();
		}
		display =display + "\n Student Names " + objStudent.getIntials() + " course code" + objStudent.getCourse().getCourseCode();
		JOptionPane.showMessageDialog(null, display);
	}

}