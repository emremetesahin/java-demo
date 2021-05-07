package nLayeredProject;

import nLayeredProject.business.abstracts.ProductService;
import nLayeredProject.business.concretes.ProductManager;
import nLayeredProject.business.utils.JLoggerManagerAdapter;
import nLayeredProject.dataAccess.concretes.AbcProductDao;
import nLayeredProject.dataAccess.concretes.HibernateProductDao;
import nLayeredProject.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		ProductService productService=new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
		Product product=new Product(1,1,"Elma",12,50);
		productService.add(product);
	}

}
 