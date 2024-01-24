package com.HUFS19.backend.userLike;

import com.HUFS19.backend.category.Category;
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
public class UserLike {
    @EmbeddedId
    private PKUserLike pkUserLike;
    @CreationTimestamp
    private Timestamp date;

    @ManyToOne
    @JoinColumn(name="user_id")
    @MapsId("userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @MapsId("productId")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @MapsId("categoryId")
    private Category category;
}
