package com.simplevat.product.dao;

import com.simplevat.product.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends CrudRepository<Product,Integer> {

    @Override
    List<Product> findAll();

}
