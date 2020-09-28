package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		/*
		Department dep = new Department(1,"Books");
		System.out.println(dep);
		Seller seller = new Seller(12,"Marcos", "marcos@gmail.com", new Date(), 3000.0, dep);
		System.out.println(seller);
		*/
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		
		
		
	}

}
