package com.HUFS19.backend.product;

import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class ProductRepositoryImp implements ProductRepository
{
    private final EntityManager em;

    public ProductRepositoryImp(EntityManager em){
        this.em = em;
    }


    @Override
    public int save(Product product) {
        em.persist(product);
        return product.getProductId();
    }

    @Override
    public List<Product> findAll(int categoryId) {
        return em.createQuery("select p from Product p", Product.class)
                .getResultList();

    }

    @Override
    public Optional<Product> findById(int productId) {

        List<Product> result = em.createQuery("select p from Product p where p.id = :productId", Product.class)
                .setParameter("productId", productId)
                .getResultList();
        return result.stream().findAny();
    }

    @Override
    public Optional<Product> findByName(String productName) {
        List<Product> result = em.createQuery("select p from Product p where p.productName=:productName")
                .setParameter("productName", productName)
                .getResultList();
        return result.stream().findAny();

    }
}
