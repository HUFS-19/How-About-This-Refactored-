package com.HUFS19.backend.comment;

import com.HUFS19.backend.product.Product;
import com.HUFS19.backend.user.User;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentId;
    private String content;
    @CreationTimestamp
    private Timestamp date;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;
}
