package com.HUFS19.backend.controller;

import com.HUFS19.backend.common.dto.ApiResponseDto;
import com.HUFS19.backend.common.util.ResponseUtils;
import com.HUFS19.backend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/categoryAPI")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    public CategoryController (CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping("/all")
    @ResponseBody
    public ApiResponseDto getAllCategory(){
        return ResponseUtils.ok(categoryService.getAll());
    }

    @GetMapping("/{categoryId}")
    @ResponseBody
    public ApiResponseDto getCategoryName(@PathVariable("categoryId")int categoryId){
        return ResponseUtils.ok(categoryService.getName(categoryId));
    }

}
