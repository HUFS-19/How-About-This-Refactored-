package com.HUFS19.backend.repository.category;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="category_id")
    private int id;

    @Column(name="category_name")
    private String name;

    public Category (String name){
        this.name =name;
    }
}
