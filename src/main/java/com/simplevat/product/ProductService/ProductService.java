package com.simplevat.product.ProductService;

import com.simplevat.product.dao.ProductDao;
import com.simplevat.product.exception.ProductNotFoundException;
import com.simplevat.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductService {
    @Autowired
    private ProductDao productDao;

    public Product addProduct(Product product){return productDao.save(product);}

    public List<Product> getProducts(){
        return productDao.findAll();
    }

    public Product getProduct(int iProductCode){
       Optional<Product> optionalProduct= productDao.findById(iProductCode);
        if(!optionalProduct.isPresent())
            throw new ProductNotFoundException("PRODUCT RECORD NOT AVAILABLE...");
        return optionalProduct.get();
    }

    public Product updateProduct(int iProductCode, Product product){
        product.setiProductCode(iProductCode);
        return productDao.save(product);
    }

    public void deleteProduct(int iProductCode){
        productDao.deleteById(iProductCode);
    }
}
