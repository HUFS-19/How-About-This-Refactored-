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
//getId가 아니라 getProductId로 접근해야 한다.
//@Column(name-"product_id")
//private String id;
//형식으로 변경 고민해볼 것

//전체적으로 @Column 추가
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
