package com.geekbrains.geekmarket.controllers;

import com.geekbrains.geekmarket.entities.ProductX;
import com.geekbrains.geekmarket.services.ProductServiceX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/retailer")
public class ShopControllerX {
    private ProductServiceX productServiceX;

    @Autowired
    public void setProductServiceX(ProductServiceX productServiceX) {
        this.productServiceX = productServiceX;
    }

    @GetMapping("")
    public String shopPage(Model model) {
        List<ProductX> allProducts = productServiceX.getAllProducts();
        model.addAttribute("productsx", allProducts);
        return "shop-page1";
    }

    @GetMapping("/min")
    public String shopPageMin(Model model) {
        List<ProductX> allProducts = productServiceX.getAllProductsMin();
        model.addAttribute("productsx", allProducts);
        return "shop-page1";
    }

    @GetMapping("/max")
    public String shopPageMax(Model model) {
        List<ProductX> allProducts = productServiceX.getAllProductsMax();
        model.addAttribute("productsx", allProducts);
        return "shop-page1";
    }

    @GetMapping("/minmax")
    public String shopPageMinAndMax(Model model) {
        List<ProductX> allProducts = productServiceX.getAllProductsMinAndMax();
        model.addAttribute("productsx", allProducts);
        return "shop-page1";
    }

}

