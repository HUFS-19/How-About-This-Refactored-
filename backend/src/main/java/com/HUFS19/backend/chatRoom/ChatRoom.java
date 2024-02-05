package com.HUFS19.backend.chatRoom;

import com.HUFS19.backend.category.Category;
import com.HUFS19.backend.product.Product;
import com.HUFS19.backend.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ChatRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chat_room_id")
    private int id;
    @ManyToOne
    @JoinColumn(name="productId")
    private Product product;

    @ManyToOne
    @JoinColumn(name="userId")
    private User user;

    @ManyToOne
    @JoinColumn(name="categoryId")
    private Category category;

    @ManyToOne
    @JoinColumn(name="inquirerId")
    private User inquirer;
}
