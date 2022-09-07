package Day3_4;

import java.util.LinkedList;
import java.util.List;

public class Productsadd {
	public List<Products>addProducts(){
		List<Products> prd=new LinkedList<Products>();
		prd.add(new Products(101,"Pen",150));
		prd.add(new Products(102,"Pencil",350));
		prd.add(new Products (103,"Eraser",550));
		prd.add( new Products(104,"writing pad",660));
		prd.add(new Products(105,"A4 paper",230));
		prd.forEach((Products p1)->{
			if (p1.getPrdPrice() <0) 
				throw new RuntimeException("Price caanot be negative");
			
		});
		return prd;
	}

}
