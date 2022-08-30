package Assignment;

public class myOwnAutoshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Car c=new Car(120, 150, "red");
		Sedan s=new Sedan(150,5000,"red");
		Ford f = new Ford(33,8000,"black",5000);
		Ford f1 = new Ford(33,9000,"black",4000);
		System.out.println("Price of sedan Car\t"+s.getSalePrice(10));
		System.out.println("Price of first ford car\t"+f.getSalePrice());
		System.out.println("Price of second ford car\t"+f1.getSalePrice());
	}

}
