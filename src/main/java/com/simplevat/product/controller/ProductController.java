package com.simplevat.product.controller;

import com.simplevat.product.ProductService.ProductService;
import com.simplevat.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/admin/master/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public Product addProduct(@RequestBody Product product){
       return productService.addProduct(product);
    }

    @GetMapping
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping(value = "/{iProductCode}")
    public Product getProduct(@PathVariable int iProductCode){
        return productService.getProduct(iProductCode);
    }
    @PutMapping(value = "/{iProductCode}")
    public Product updateProduct(@PathVariable("iProductCode") int iProductCode,@RequestBody Product product){
        return productService.updateProduct(iProductCode,product);
    }
    @DeleteMapping(value = "{iProductCode}")
    public void deleteContact(@PathVariable("iProductCode") int iProductCode){
        productService.deleteProduct(iProductCode);
    }
}
