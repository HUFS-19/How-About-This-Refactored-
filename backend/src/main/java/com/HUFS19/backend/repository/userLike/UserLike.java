package com.HUFS19.backend.repository.userLike;

import com.HUFS19.backend.repository.category.Category;
import com.HUFS19.backend.repository.product.Product;
import com.HUFS19.backend.repository.user.User;
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
    private PKUserLike pk;
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
