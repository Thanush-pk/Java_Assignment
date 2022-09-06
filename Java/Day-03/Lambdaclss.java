package Assignment;

import java.util.List;

public class Lambdaclss {
	public List<Students>marksSort(){
List<Students>std=new StudentAdd().addStudents();
		System.out.println("Sorts according to marks");
		std.sort((Students s1, Students s2)->s1.getMarks()-s2.getMarks());
		// std.sort((Students n1, Students n2)->n1.getStdName().compareTo(n2.getStdName()));
		return std; 
	 }
	
	
	public List<Students>nameSort(){
		System.out.println("Sorting according to name");
	List<Students>std1=new StudentAdd().addStudents();
	 std1.sort((Students n1, Students n2)->n1.getStdName().compareTo(n2.getStdName()));
	return std1; 
 }
	
public static void main (String args[]) 
	{
		System.out.println(new Lambdaclss().marksSort());
		System.out.println(new Lambdaclss().nameSort());
	}
}


