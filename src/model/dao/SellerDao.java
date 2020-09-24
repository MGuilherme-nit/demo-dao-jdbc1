package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj);
	void update(Seller Obj);
	void deleteById(Integer id);
	Seller findById(Integer id); //retornando um department recebendo integer id
	List<Seller> findAll();
	

}
