package com.products.apirest.resources;

import com.products.apirest.models.Products;
import com.products.apirest.respository.ProductsRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value="API REST Products")
@CrossOrigin(origins = "*")
public class ProductsResources {

    //create a point Dependency Injection
    @Autowired
    ProductsRepository productsRepository;

    // to do retrieve all products
    @GetMapping("/products")
    @ApiOperation("Retrieve list Products.")
    public List<Products>productsList(){

        return productsRepository.findAll();
    }
    // to do retrieve products ID
    @GetMapping("/products/{id}")
    @ApiOperation("Retrieve a unique Product.")
    public Products productsListUnique (@PathVariable long id ){

        return productsRepository.findById(id);
    }
    // Create a products
    @PostMapping("/products")
    @ApiOperation(" Create a Product.")
    public Products createProduct (@RequestBody Products products) {

        return productsRepository.save(products);
    }
    // delete a products
    @DeleteMapping("/products")
    @ApiOperation("Delete a Product.")
    public void  deleteProduct (@RequestBody Products products){

        productsRepository.delete(products);
    }
    //to do update products
    @PutMapping("/products")
    @ApiOperation("Update Product.")
    public Products updateProducts (@RequestBody Products products) {

        return productsRepository.save(products);
    }
}

