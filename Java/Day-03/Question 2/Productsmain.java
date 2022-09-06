package Day3_4;

import java.util.List;

public class Productsmain {
	public List<Products>sortprice()throws Exceptionprd{
		List<Products> prd =new Productsadd().addProducts();
		prd.sort((Products p1,Products p2)->p1.getPrdPrice()-p2.getPrdPrice());
		return prd;
	}
	public static void myException(Products p1)throws Exceptionprd {
	
		if(p1.prdPrice<0)
			throw new Exceptionprd("Price cannot be n negative");
		else
			System.out.println("Price is");
		
	}
		public static void main(String args[])throws Exceptionprd {
			System.out.println(new Productsmain().sortprice());
			
		}
}
