package com.sonata.Model;

import java.util.List;

import com.sonata.DAOimpl.Productimpl;

public class Productmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		p.setPrdId(11);
		p.setPrdName("hii");
		p.setPrdPrice(2000);
			
			Productimpl p1 = new Productimpl();
			List<Product> a1=p1.getdata();
			System.out.println(a1);

	}

}
