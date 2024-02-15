package com.HUFS19.backend.controller;

import com.HUFS19.backend.common.dto.ApiResponseDto;
import com.HUFS19.backend.common.dto.ErrorResponse;
import com.HUFS19.backend.common.util.ResponseUtils;
import com.HUFS19.backend.dto.product.ProductImgDto;
import com.HUFS19.backend.repository.productImg.ProductImgRepository;
import com.HUFS19.backend.service.ProductImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/productAPI")
public class ProductImgController {
    @Autowired
    ProductImgService productImgService;

    public ProductImgController(ProductImgService productImgService){
        this.productImgService=productImgService;
    }

    @GetMapping("/{productId}/imgs")
    @ResponseBody
    public ApiResponseDto getProductimgs(@PathVariable("productId")int productId){
        List<ProductImgDto> imgs = productImgService.getImg(productId);
        if(imgs.isEmpty()){
            return ResponseUtils.error(new ErrorResponse("상품 이미지를 찾을 수 없습니다."));
        }
        return ResponseUtils.ok(imgs);

    }
}
