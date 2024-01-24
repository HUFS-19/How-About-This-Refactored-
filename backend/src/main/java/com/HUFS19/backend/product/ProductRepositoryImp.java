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
    public Product save(Product product) {

        em.persist(product);
        return product;
    }

    @Override
    public List<Product> findAll(int categoryId) {
        return null;
    }

    @Override
    public Optional<Product> findById(int ProductId) {

        List<Product> result = em.createQuery("select p from Product p where p.id = :ProductId", Product.class)
                .setParameter("ProductId", ProductId)
                .getResultList();
        return result.stream().findAny();
    }
}
