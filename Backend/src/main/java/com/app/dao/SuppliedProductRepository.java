package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Category;
import com.app.pojos.SuppliedProduct;

@Repository
public interface SuppliedProductRepository extends JpaRepository<SuppliedProduct, Integer>{
	List<SuppliedProduct> findBySuppliedCategory(Category c);
}
