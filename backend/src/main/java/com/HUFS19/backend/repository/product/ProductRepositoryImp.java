package com.HUFS19.backend.repository.product;

import com.HUFS19.backend.dto.product.ProductSummary;
import com.querydsl.jpa.impl.JPAQuery;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class ProductRepositoryImp implements ProductRepository
{
    private final EntityManager em;
    private JPAQuery query;

    public ProductRepositoryImp(EntityManager em){
        this.em = em;
        query = new JPAQuery(em);
}



    @Override
    public int save(Product product) {
        em.persist(product);
        return product.getId();
    }

    @Override
    public List<Product> findAll(int categoryId) {
//        return em.createQuery("select p from Product p", Product.class)
//                .getResultList();
//
        QProduct product = QProduct.product;

        return query.from(product).select(product).fetch();
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
        List<Product> result = em.createQuery("select p from Product p where p.name=:productName", Product.class)
                .setParameter("productName", productName)
                .getResultList();
        return result.stream().findAny();

    }

    @Override
    public List<Product> findByNameLike(String name) {
        return em.createQuery("select P from Product p where p.name like :name", Product.class)
                .setParameter("name", name)
                .getResultList();
    }

    @Override
    public List<Product> findByUploaderLike(String uploader) {
        return null;
    }

    @Override
    public List<Product> findByTagLike(String tag) {
        return null;
    }

    @Override
    public List<ProductSummary> findCategoryProducts(int categoryId, String sort) {
    return null;
    }
}
