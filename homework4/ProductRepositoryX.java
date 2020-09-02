package com.geekbrains.geekmarket.repositories;

import com.geekbrains.geekmarket.entities.ProductX;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepositoryX extends PagingAndSortingRepository<ProductX, Long> {
    List<ProductX> findAll();

    @Query(value = "select * from productsx " +
            "where price = (select MIN(price) as price from productsx where title like 'Ноутбук%')", nativeQuery = true)
    List<ProductX> myQueryMin();

    @Query(value = "select * from productsx " +
            "where price = (select MAX(price) as price from productsx where title like 'Ноутбук%')", nativeQuery = true)
    List<ProductX> myQueryMax();

    @Query(value = "select * from productsx " +
            "where price = (select MIN(price) as price from productsx where title like 'Ноутбук%')" +
            " or price = (select MAX(price) as price from productsx where title like 'Ноутбук%')", nativeQuery = true)
    List<ProductX> myQueryMinAndMax();
}
