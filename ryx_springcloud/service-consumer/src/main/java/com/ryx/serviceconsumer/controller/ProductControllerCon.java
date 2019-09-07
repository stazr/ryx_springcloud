package com.ryx.serviceconsumer.controller;

import com.ryx.serviceconsumer.service.SuccessProductService;
import com.ryx.serviceinterface.pojo.RyxProduct;
import com.ryx.serviceinterface.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: ryx_springcloud
 *
 * @description:
 *
 * @author: renyuanxin
 *
 * @create: 2019-02-01 16:16
 **/
@RestController
public class ProductControllerCon {

    @Autowired
    private ProductService productService;

    @Autowired
    private SuccessProductService successProductService;


    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public  List<RyxProduct> getList(){
        return this.productService.getLisByRyxProduct();
    }

    /**
     * 新增
     */
    @RequestMapping(value = "/insert")
    public String insert(String name,Integer price){
        this.successProductService.globalTransactionAdd(name,price);
        return "ok";
    }
}
