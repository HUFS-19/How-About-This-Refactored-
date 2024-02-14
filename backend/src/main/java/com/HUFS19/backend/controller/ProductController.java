package com.HUFS19.backend.controller;

import com.HUFS19.backend.common.dto.ApiResponseDto;
import com.HUFS19.backend.common.dto.ErrorResponse;
import com.HUFS19.backend.common.util.ResponseUtils;
import com.HUFS19.backend.dto.product.CategoryproductsResponse;
import com.HUFS19.backend.dto.product.ProductImgDto;
import com.HUFS19.backend.repository.product.Product;
import com.HUFS19.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Controller
@RequestMapping("/productAPI")
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

    @GetMapping("/{productId}/imgs")
    @ResponseBody
    public ApiResponseDto getProductimgs(@PathVariable("productId")int productId){
        List<ProductImgDto> imgs = productService.getImg(productId);
        if(imgs.isEmpty()){
            return ResponseUtils.error(new ErrorResponse("상품 이미지를 찾을 수 없습니다."));
        }
        return ResponseUtils.ok(imgs);

    }
}
