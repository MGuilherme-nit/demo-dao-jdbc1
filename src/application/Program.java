package application;

import java.util.List;

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
		System.out.println("---- teste 1 - seller findById ----");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n---- teste 2 - seller findByDepartment ----");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
			
		}
		
		System.out.println("\n---- teste 3 - seller findAll ----");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
			
		}
	
		
		
		
	}

}
