package com.HUFS19.backend.productImg;

import com.HUFS19.backend.product.Product;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProductImg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "img_id")
    private int id;
    @ManyToOne
    @JoinColumn(name="productId")
    private Product product;
    private String img;
    @Column(name = "img_order")
    private int order;
}
