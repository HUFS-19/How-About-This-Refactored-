package com.HUFS19.backend.productImg;

import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class ProductImgRepositoryImp implements ProductImgRepository{
    private EntityManager em;

    public ProductImgRepositoryImp(EntityManager em){
        this.em=em;
    }

    @Override
    public int save(ProductImg productImg) {
        em.persist(productImg);
        return productImg.getId();
    }

    @Override
    public Optional<ProductImg> findById(int productImgId) {
        return Optional.ofNullable(em.find(ProductImg.class, productImgId));
    }

    @Override
    public Optional<ProductImg> findByProductId(int productId) {
        List<ProductImg> result = em.createQuery("select pimg from ProductImg pimg where pimg.product.id=:productId", ProductImg.class)
                .setParameter("productId", productId)
                .getResultList();
        return result.stream().findAny();
    }
}
