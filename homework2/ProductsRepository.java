package com.geekbrains.repositories;

import com.geekbrains.entites.Product;
import com.geekbrains.entites.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductsRepository {
    private List<Product> productList;

    public ProductsRepository() {
        this.productList = new ArrayList<>(10);
    }

    public void giveAllProducts() {
        for(int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            System.out.println(product);
        }
    }

    public Product giveProductById(int id) {
        Product product1 = new Product();
        product1.setId(0);
        product1.setTitle("product1");
        product1.setCost(100);

        Product product2 = new Product();
        product2.setId(1);
        product2.setTitle("product2");
        product2.setCost(200);

        productList.add(0, product1);
        productList.add(1, product2);

        Product product = productList.get(id);
        return product;
    }

}
