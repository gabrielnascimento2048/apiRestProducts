package com.products.apirest.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class Products {

    @Id
    @GeneratedValue
    private Long id;


    private String name;
    private BigDecimal amount;
    private BigDecimal value;

}
