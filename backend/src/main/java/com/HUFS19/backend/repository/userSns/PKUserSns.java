package com.HUFS19.backend.repository.userSns;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class PKUserSns implements Serializable {
    private String userId;
    private int snsId;
    public PKUserSns(String userId, int snsId){
        this.userId=userId;
        this.snsId=snsId;
    }

}
