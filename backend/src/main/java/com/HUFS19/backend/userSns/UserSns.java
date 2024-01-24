package com.HUFS19.backend.userSns;

import com.HUFS19.backend.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserSns {
    @EmbeddedId
    private PKUserSns pkUserSns;

    @Column(name = "sns_link")
    private String snsLink;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @MapsId("userId")
    User user;
}
