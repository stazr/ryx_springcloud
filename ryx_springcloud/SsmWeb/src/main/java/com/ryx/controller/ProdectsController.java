package com.ryx.controller;


import com.ryx.serviceinterface.pojo.RyxProduct;
import com.ryx.serviceinterface.service.ProductService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: ryx_springcloud
 *
 * @description:
 *
 * @author: renyuanxin
 *
 * @create: 2019-02-02 09:15
 **/
@RestController
public class ProdectsController {


    @Resource
    private ProductService productService;


    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<RyxProduct> getList(){
        return this.productService.getLisByRyxProduct();
    }
}
