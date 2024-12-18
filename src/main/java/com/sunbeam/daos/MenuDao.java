package com.sunbeam.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sunbeam.entities.Item;

public interface MenuDao extends JpaRepository<Item, Integer>{
	
	@Query(value="select distinct category from pizza_items where type=\"veg\"", nativeQuery = true)
	List<String> findByCategory();
	
	@Query(value="select distinct category from pizza_items where type=\"nonveg\"", nativeQuery = true)
	List<String> findByNonVegCategory();
	
//	@Query(value="select name,description from pizza_items where category=?1 having type=?2", nativeQuery = true)
//	List<Item> findByName(String name);
	@Query("SELECT p.name, p.description FROM Pizza_Items p WHERE p.category = :category AND p.type = :type") 
	List<Object[]> findByCategoryAndType(@Param("category") String category, @Param("type") String type);
	
	
}