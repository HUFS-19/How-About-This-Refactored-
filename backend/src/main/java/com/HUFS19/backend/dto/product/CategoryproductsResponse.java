package com.HUFS19.backend.dto.product;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CategoryproductsResponse {
    private List<ProductSummary> productSummaries;
}
