package com.HUFS19.backend.repository.userLike;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class PKUserLike implements Serializable {
    private String userId;
    private int productId;
    private int categoryId;

    public PKUserLike(String userId, int productId, int categoryId){
        this.userId = userId;
        this.productId = productId;
        this.categoryId = categoryId;
    }
}
