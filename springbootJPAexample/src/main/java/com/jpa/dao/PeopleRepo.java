package com.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.entity.PeopleTable;

public interface PeopleRepo extends CrudRepository<PeopleTable, Integer>{
	
	public List<PeopleTable> findByCity(String city);
	//here find is introducer and bycity is criteria;

	
	public List<PeopleTable> findByStatusStartingWith(String prefix);
	
	@Query("select u from PeopleTable u")
	public List<PeopleTable> getAllUser();
	
	@Query("select u from PeopleTable u where u.name=:n")
	public List<PeopleTable> getUserByName(@Param("n") String name);
}
