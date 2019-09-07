package com.ryx.serviceinterface.fallback;

import com.ryx.serviceinterface.pojo.RyxProduct;
import com.ryx.serviceinterface.service.ProductService;

import java.util.List;

/**
 * @program: ryx_springcloud
 *
 * @description:
 *
 * @author: renyuanxin
 *
 * @create: 2019-02-18 15:06
 **/
public class ProductServiceFallback implements ProductService {


    @Override
    public List<RyxProduct> getLisByRyxProduct() {
        return null;
    }

    @Override
    public String insertPro(String name,Integer price) {
        return "ok";
    }
}
