package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Yap?c? blok ?al??t?");
	}
	public static boolean isValid(Product product) {
		if(product .price>5&&!product.name.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
