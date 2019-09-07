package com.ryx.serviceprodect.controller;

import com.ryx.serviceinterface.pojo.RyxProduct;
import com.ryx.serviceprodect.service.RyxProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * auth
 */
@RestController
public class RyxProductController{


	@Autowired
	private RyxProductService ryxProductService;

	/**
	 * 查询列表
	 */
	@RequestMapping("/list")
    public List<RyxProduct> getProducts(){

		List<RyxProduct> list = ryxProductService.getList();

		return list;
    }


	/**
	 * 新增商品
	 */
	@RequestMapping("/insertPro")
	public String insertPro(String name,Integer price){
		RyxProduct product = new RyxProduct();
		product.setName(name);
		product.setPrice(price);
		Integer add = ryxProductService.add(product);
		return "ok";
	}
}