package com.geekbrains.geekmarket.services;

import com.geekbrains.geekmarket.entities.ProductX;
import com.geekbrains.geekmarket.repositories.ProductRepositoryX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceX {
    private ProductRepositoryX productRepositoryX;

    @Autowired
    public void setProductRepositoryX(ProductRepositoryX productRepositoryX) {
        this.productRepositoryX = productRepositoryX;
    }

    public List<ProductX> getAllProducts() {
        List<ProductX> productsx = productRepositoryX.findAll();
        return productsx;

//        4. * Добавить постраничное отображение (по 5 записей на странице).
//        Page<ProductX> pr = productRepositoryX.findAll(PageRequest.of(2,5));
//        System.out.println(pr);
//        return pr.stream().collect(Collectors.toList());

    }

    public List<ProductX> getAllProductsMin() {
        List<ProductX> productsx = productRepositoryX.myQueryMin();
        return productsx;
    }

    public List<ProductX> getAllProductsMax() {
        List<ProductX> productsx = productRepositoryX.myQueryMax();
        return productsx;
    }

    public List<ProductX> getAllProductsMinAndMax() {
        List<ProductX> productsx = productRepositoryX.myQueryMinAndMax();
        return productsx;
    }
}
