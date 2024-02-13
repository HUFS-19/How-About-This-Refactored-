package com.HUFS19.backend.repository.chatRoom;

import com.HUFS19.backend.repository.category.Category;
import com.HUFS19.backend.repository.product.Product;
import com.HUFS19.backend.repository.user.User;
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
