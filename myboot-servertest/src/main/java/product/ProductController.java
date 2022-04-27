package product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	
	@Autowired
	@Qualifier("productservice")
	ProductService service;
	
	@RequestMapping("/productlist")
	public ModelAndView productList(Model model) {
		ModelAndView mv = new ModelAndView();
		List<ProductDTO> list = service.productList();
		mv.addObject("list",list);
		mv.setViewName("productlist");
		return mv;
		
	}
	
	@RequestMapping("/product")
	public ModelAndView product(int productcode) {
		ModelAndView mv = new ModelAndView();
		ProductDTO dto = service.product(productcode);
		mv.addObject("productdto",dto);
		mv.setViewName("mybatis/product");
		return mv;
		
	}
	
}
