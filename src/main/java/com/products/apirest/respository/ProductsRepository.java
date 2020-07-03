package com.products.apirest.respository;

import com.products.apirest.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;

public interface ProductsRepository extends JpaRepository<Products, Long> {

    Products findById(long id);
}
