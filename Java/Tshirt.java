package Assignment;

public class Tshirt {
	String color;
	String material;
	String design;
	Tshirt (String color, String material, String design){
		this.color=color;
		this.material=material;
		this.design=design;
	}
	public void small() {
		System.out.println("T shirt of size small "+color+"\t"+material+"\t"+design);
	}
	public void large() {
	System.out.println("Tshirt of size Large "+color+"\t"+material+"\t"+design);
	}
	public void x_large() {
		System.out.println("TShirt of size Xtra Large "+color+"\t"+material+"\t"+design);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tshirt Small =new Tshirt("red","Nylon","Stripes");
		Tshirt large =new Tshirt("Blue","Polythene","Checks");
		Tshirt x_large =new Tshirt("Black","Cotton","lines");
		
		Small.small();
		large.large();
		x_large.x_large();	
	}

}
