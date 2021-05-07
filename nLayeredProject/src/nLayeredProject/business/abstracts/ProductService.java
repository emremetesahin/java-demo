package nLayeredProject.business.abstracts;

import java.util.List;

import nLayeredProject.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	List<Product>getAll();

}
