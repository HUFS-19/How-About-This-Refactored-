package com.HUFS19.backend.productImg;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductImgRepository {
    int save(ProductImg productImg);

    Optional<ProductImg> findById(int productImgId);

    Optional<ProductImg> findByProductId(int productId);
}
