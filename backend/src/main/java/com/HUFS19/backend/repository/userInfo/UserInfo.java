package com.HUFS19.backend.repository.userInfo;

import com.HUFS19.backend.repository.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserInfo {
    @Id
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
    @Column(name = "user_icon")
    private String icon;
    private String introduce;
    private String nickname;

}
