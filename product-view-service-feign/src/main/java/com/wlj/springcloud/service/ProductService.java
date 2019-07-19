package com.wlj.springcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wlj.springcloud.client.ProductClientFeign;
import com.wlj.springcloud.pojo.Product;

@Service
public class ProductService {

	@Autowired
	ProductClientFeign productClientFeign;

	public List<Product> listProducts() {
		return productClientFeign.listProdcuts();

	}
}
