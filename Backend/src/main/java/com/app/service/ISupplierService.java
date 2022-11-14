package com.app.service;

import java.util.List;

import com.app.pojos.Address;
import com.app.pojos.Product;
import com.app.pojos.SuppliedProduct;

public interface ISupplierService {
	List<?> getAllProductsBySupplier(int supplierId);	

	String getProductCategoryName(int supplierId);	
	
	Product getProductById(int productId);
	
	String updateProduct(int productId, Product product);
	
	Product addProduct(String CategoryName, Product product);
	
	SuppliedProduct addProductBySupplier(String CategoryName, SuppliedProduct product);
	
	String deleteProduct(int productId);
	
	List<SuppliedProduct> getSuppliedProducts(int supplierId);
	
	String deleteFromSuppliedProducts(int productId);
	
	String addAddress(int userId, Address address);
}
