package com.geekbrains.controllers;

import com.geekbrains.entites.Product;
import com.geekbrains.entites.Products;
import com.geekbrains.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductsController {
    private ProductsService productsService;

    @Autowired
    public void setProductsService(ProductsService productsService) {
        this.productsService = productsService;
    }

    @RequestMapping("/showProduct")
    public String hello(Model uiModel, @ModelAttribute("product") Product product) {

        Product[] products = new Product[2];
        products[0] = productsService.getProductById(0);
        products[1] = productsService.getProductById(1);

        Products productsList = new Products();
        productsList.setProducts(products);

        uiModel.addAttribute("products", productsList);
        System.out.println(product.getId() + " " + product.getTitle() + " " + product.getCost());
        return "products";
    }

    @RequestMapping(path = "/showProductById", method = RequestMethod.GET)
    @ResponseBody
    public Product showProductById(Model uiModel, @RequestParam int id) {
        Product product = productsService.getProductById(id);
        return product;
    }

    @RequestMapping("/showForm")
    public String showSimpleForm(Model uiModel) {
        Product product = new Product();
        uiModel.addAttribute("product", product);
        return "product-form";
    }


    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("product") Product product) {
        return "product-form-result";
    }

}
