package product;

import java.util.List;

public interface ProductService {
	public List<ProductDTO> productList();
	ProductDTO product(int productcode);
}
