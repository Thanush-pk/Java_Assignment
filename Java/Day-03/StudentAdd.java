package Assignment;

import java.util.LinkedList;
import java.util.List;

public class StudentAdd {
	public List<Students>addStudents(){
		List<Students> std= new LinkedList<Students>();
		std.add(new Students(121,"Ramesh", 86));
		std.add(new Students(122,"Suresh", 56));
		std.add(new Students(123,"sathish", 66));
		std.add(new Students(124,"Roshan", 96));
		return std;
//		
	}
}
