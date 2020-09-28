package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		/*
		Department dep = new Department(1,"Books");
		System.out.println(dep);
		Seller seller = new Seller(12,"Marcos", "marcos@gmail.com", new Date(), 3000.0, dep);
		System.out.println(seller);
		*/
		System.out.println("---- teste 1 - seller findById ----");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		
		
		
	}

}
