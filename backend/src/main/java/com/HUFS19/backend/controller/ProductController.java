package com.HUFS19.backend.controller;

import com.HUFS19.backend.dto.product.CategoryproductsResponse;
import com.HUFS19.backend.repository.product.Product;
import com.HUFS19.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@org.springframework.stereotype.Controller
public class ProductController {
    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService){
        this.productService=productService;
    }

    @GetMapping("/product/{id}")
    @ResponseBody
    public Product getProductById(@PathVariable("id") int productId){
        Optional<Product> result = productService.findOne(productId);
        if (result.isEmpty()){
            throw new IllegalStateException("error");
        }
        return result.get();
    }

//    @GetMapping("/productAPI/list")
//    @ResponseBody
//    public CategoryproductsResponse getCategoryProducts(@RequestParam int category, @RequestParam String sort){
//        CategoryproductsResponse categoryproductsResponse = new CategoryproductsResponse();
//        categoryproductsResponse.setProductSummaries(productService.getCategoryProducts(category, sort));
//        return categoryproductsResponse;
//    }

    @GetMapping("/")
    @ResponseBody
    public String home(){
        return "welcome";
    }
}
