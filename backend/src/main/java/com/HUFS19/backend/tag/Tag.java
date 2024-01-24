package com.HUFS19.backend.tag;

import com.HUFS19.backend.product.Product;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tagId;
    @ManyToOne
    @JoinColumn(name="productId")
    private Product product;
    private String tagName;
}
