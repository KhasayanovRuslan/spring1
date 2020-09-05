package com.geekbrains.geekmarket.entities;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "productsx")
@Data
public class ProductX {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private double price;
}
