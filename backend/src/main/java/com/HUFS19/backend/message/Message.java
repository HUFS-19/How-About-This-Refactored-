package com.HUFS19.backend.message;

import com.HUFS19.backend.category.Category;
import com.HUFS19.backend.chatRoom.ChatRoom;
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
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int msgId;

    private String content;

    @CreationTimestamp
    private Timestamp time;

    @ManyToOne
    @JoinColumn(name="chatRoomId")
    private ChatRoom chatRoom;

    @ManyToOne
    @JoinColumn(name="productId")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "inquirerId")
    private User inquirer;

    @ManyToOne
    @JoinColumn(name = "senderId")
    private User sender;


}
