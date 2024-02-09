package com.RestAPI;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@PostMapping("/product")
	public String saveProduct(@RequestBody Product P) {
		// logic to persist
		System.out.println(P);
		return "Product Saved";

	}

	@GetMapping("/product/{Pid}")
	public Product getProduct(@PathVariable Integer Pid) {
		Product P=null;
		if(Pid==100)
		{
			 P=new Product(100 ,"Mouse",400.4);
		}else if(Pid==101) {
			 P=new Product(101 ,"HD",3400.0);
		}
		return P;
	}
	
	@GetMapping("products")
	public List<Product> getProducts(){
		Product P1=new Product(100 ,"Mouse",400.4);
		Product P2=new Product(101 ,"HD",3400.0);
		
		List<Product> products =Arrays.asList(P1,P2);
		return products;
		
		
	}
}
