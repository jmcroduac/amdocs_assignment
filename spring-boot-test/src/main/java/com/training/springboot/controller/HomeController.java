package com.training.springboot.controller;

import java.util.List;
import java.util.Optional;

//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
////import com.training.springboot.model.Employee;
//import com.training.springboot.service.HomeService;
//
//@RestController
//@RequestMapping("/")
//public class HomeController {
//	
//	@Autowired
//	HomeService service; // will autowire service instance
//	
//	@RequestMapping("/login")
//	public String hello(HttpServletRequest req) {
//				
//		String uName = req.getParameter("uname"); // this will fetch the uname from jsp page
//		
//		String pwd = req.getParameter("pwd");
//		boolean valid = service.isValid(uName);// call the service method
//		if(valid)
//			return "main";
//		else {
//			return "failure";
//		}
//	}
//	
//	@RequestMapping(value = "getUsers", method = RequestMethod.GET)
//	public List<Employee> login(HttpServletRequest request) {
//				
//		return service.getAllEmp();
//	}
//	
//	@RequestMapping(method=RequestMethod.GET)
//	public String sayHi() {
//		return "login";
//	}
//
//}

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.training.springboot.model.Product;
import com.training.springboot.service.HomeService;


@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	HomeService service; // will autowire service instance
	
	@RequestMapping(method=RequestMethod.GET)
	public String initialReg() {
		return "home";
	}
	
	@RequestMapping("addNewProduct")
	public String addNewProduct(HttpServletRequest req) {
				
		String productName = req.getParameter("name"); // this will fetch the uname from jsp page
		int productPrice = Integer.parseInt(req.getParameter("price"));
		service.saveProduct(productName, productPrice);
		req.setAttribute("productName", productName);
		req.setAttribute("productPrice", productPrice);

		return "addSuccess";
	}
	
	@RequestMapping("deleteProduct")
	public String deleteProduct(HttpServletRequest req) {
				
		int productID = Integer.parseInt(req.getParameter("id"));
		Product product = service.findProduct(productID).get();
		req.setAttribute("product", product);
		
		service.deleteProduct(productID);
		return "deleteSuccess";
	}
	
	@RequestMapping("findProduct")
	public String findProduct(HttpServletRequest req) {
				
		int productID = Integer.parseInt(req.getParameter("id"));
		Optional<Product> product = service.findProduct(productID);
		Product prod = product.get();
		req.setAttribute("product", prod);
		
		return "findProduct";
	}
	
	@RequestMapping("listAllProducts")
	public String listAllProducts(HttpServletRequest req) {
				
		List<Product> allProducts = service.getAllProducts();
		req.setAttribute("allProducts", allProducts);
		
		return "listAllProducts";
	}
	
//	//rest
//	@RequestMapping(value="getAllProducts",method=RequestMethod.GET)
//	public List<Product> getAllProducts(HttpServletRequest req) {
//				
//		return service.getAllProducts();
//	}
//	
//	//rest
//	@GetMapping("/getProduct/{id}")
//	  public ResponseEntity<Product> getProductById(@PathVariable("id") int id) {
//	    Optional<Product> product = service.findProduct(id);
//
//	    if (product.isPresent()) {
//	      return new ResponseEntity<>(product.get(), HttpStatus.OK);
//	    } else {
//	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	    }
//	  }
//	
//	//rest
//	@RequestMapping(value="/deleteProduct/{id}", method= {RequestMethod.DELETE,RequestMethod.GET})
//	  public ResponseEntity<HttpStatus> deleteProduct(@PathVariable("id") int id) {
//	    try {
//	      service.deleteProduct(id);
//	      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	  }
//	
//	//rest
//	@PostMapping("/addNewProduct")
//	  public ResponseEntity<Product> createProduct(@RequestBody Product product) {
//	    try {
//	      service.addProduct(product);
//	      return new ResponseEntity<>(product, HttpStatus.CREATED);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	  }
}
