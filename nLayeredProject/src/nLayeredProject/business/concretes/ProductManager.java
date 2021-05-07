package nLayeredProject.business.concretes;

import java.util.List;

import nLayeredProject.business.abstracts.ProductService;
import nLayeredProject.business.utils.LoggerService;
import nLayeredProject.dataAccess.abstracts.ProductDao;
import nLayeredProject.entities.concretes.Product;

public class ProductManager implements ProductService {
	private ProductDao productDao;
	private LoggerService loggerService;
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		this.productDao = productDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
		productDao.add(product);
		loggerService.logToSystem("Loglandý");
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
