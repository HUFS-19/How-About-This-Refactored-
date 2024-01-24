package com.HUFS19.backend.product;

import com.HUFS19.backend.category.Category;
import com.HUFS19.backend.user.User;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
@Entity
@Getter
@Setter
public class Product {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int productId;
    private String productName;
    private String detail;
    private String link;
    private String mainImg;
    @CreationTimestamp
    private Timestamp date;
    @ManyToOne
    @JoinColumn(name = "userId", updatable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "categoryId", updatable = false)
    private Category category;


}
