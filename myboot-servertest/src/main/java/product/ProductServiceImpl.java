package product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("productservice")
public class ProductServiceImpl implements ProductService{

	@Autowired
	@Qualifier("productdao")
	ProductDAO dao;
	
	@Override
	public List<ProductDTO> productList() {
		return dao.productlist();
	}
	
	@Override
	public ProductDTO product(int productcode) {
		return dao.product(productcode);
	}

}
