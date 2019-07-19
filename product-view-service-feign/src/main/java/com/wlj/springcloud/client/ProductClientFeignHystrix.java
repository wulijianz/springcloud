package com.wlj.springcloud.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.wlj.springcloud.pojo.Product;

@Component
public class ProductClientFeignHystrix implements ProductClientFeign {

	public List<Product> listProdcuts() {
		List<Product> result = new ArrayList<>();
		result.add(new Product(0, "产品数据微服务不可用", 0));
		return result;
	}
}
