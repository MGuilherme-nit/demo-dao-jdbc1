package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	void update(Department Obj);
	void deleteById(Integer id);
	Department findById(Integer id); //retornando um department recebendo integer id
	List<Department> findAll();
	

}
