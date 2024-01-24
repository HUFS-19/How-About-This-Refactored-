package com.HUFS19.backend.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@org.springframework.stereotype.Controller
public class Controller {
    private final ProductService productService;
    @Autowired
    public Controller(ProductService productService){
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

    @GetMapping("/")
    @ResponseBody
    public String home(){
        return "welcome";
    }
}
