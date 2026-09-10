package com.basics;

import org.springframework.stereotype.Component;


@Component
public class Product {
    String product_name="Laptop";
    float price=45000.00f;

    public String getProductDetails(){
        return "Product is: "+product_name+"\nprice of product is : "+price;
    }
}
