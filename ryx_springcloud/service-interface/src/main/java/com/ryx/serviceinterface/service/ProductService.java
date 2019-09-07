package com.ryx.serviceinterface.service;

import com.ryx.serviceinterface.pojo.RyxProduct;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author renyuanxin
 * http://localhost:2100
 * @Title: ProductService
 * @ProjectName ryx_springcloud
 * @Description: TODO
 * @date 2019/2/117:28
 */
@FeignClient(name = "PRODUCT-SERVICE",configuration = FeignClientsConfiguration.class)
@EnableCircuitBreaker
public interface ProductService {

    /**
     * 查询商品列表
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public  List<RyxProduct> getLisByRyxProduct();


    /**
     * 新增商品
     */
    @RequestMapping(value = "/insertPro",method = RequestMethod.POST)
    public String insertPro(@RequestParam("name") String name,@RequestParam("price") Integer price);


}
